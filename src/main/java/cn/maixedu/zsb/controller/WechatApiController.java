package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.model.view.WechatLogSuccessResult;
import cn.maixedu.zsb.model.view.WechatSession;
import cn.maixedu.zsb.model.view.WechatUserInfo;
import cn.maixedu.zsb.model.view.WechatUserInfoDetail;
import cn.maixedu.zsb.service.DealRecordService;
import cn.maixedu.zsb.service.UserService;
import cn.maixedu.zsb.utils.*;
import cn.maixedu.zsb.wxpaysdk.*;
import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Description: 微信相关的controller
 * @Author:lw
 * @Date:2020/8/29
 */
@RequestMapping("/wechat")
@Controller
public class WechatApiController {

    @Autowired
    UserService userService;

    @Autowired
    DealRecordService dealRecordService;

    @RequestMapping("/login")
    @ResponseBody
    public Return login(@RequestBody WechatUserInfo userInfo) {
        WechatSession wechatSession = code2session(userInfo.getCode());
        if (wechatSession != null && wechatSession.getErrcode() == 0) {
            WechatUserInfoDetail wechatUserInfoDetail = JSON.parseObject(userInfo.getRawData(), WechatUserInfoDetail.class);
            User u = new User();
            u.setOpenid(wechatSession.getOpenid());
            u.setAvatar(wechatUserInfoDetail.getAvatarUrl());
            u.setSex(wechatUserInfoDetail.getGender() == 1 ? "男" : "女");
            u.setNickname(wechatUserInfoDetail.getNickName());
            if (userService.addUserByOpenid(u) != Code.Fail) {
                User uResult = userService.findUserByOpenid(u.getOpenid());
                WechatLogSuccessResult wechatLogSuccessResult = new WechatLogSuccessResult();
                wechatLogSuccessResult.setUser(uResult);
                String token = JWT.sign(uResult, 3600L * 1000L * 24L);
                wechatLogSuccessResult.setToken(token);
                return new Return(Code.Success, wechatLogSuccessResult, "登录成功");
            } else {
                return new Return(Code.Fail, null, "写入数据库失败");
            }

        } else {
            return new Return(Code.ResponseEmpty, wechatSession == null ? null : wechatSession.getErrmsg(), "session获取失败");
        }
    }

    /**
     * APPID: wx04753140ee90a047
     * APPSECRET:45a8c17d7b02c86d66f7b31b06993e92
     *
     * @param code
     * @return WechatSession
     */
    private WechatSession code2session(String code) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.weixin.qq.com/sns/jscode2session?appid=wx04753140ee90a047&secret=45a8c17d7b02c86d66f7b31b06993e92&js_code=" + code + "&grant_type=authorization_code")
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            return JSON.parseObject(response.body().string(), WechatSession.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @ResponseBody
    @RequestMapping("/success")
    public String paySuccessCallBack(HttpServletRequest request, HttpServletResponse response) throws Exception {
        InputStream inputStream = request.getInputStream();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        String resultXml = new String(outputStream.toByteArray(), StandardCharsets.UTF_8);
        Map<String, String> params = WXPayUtil.xmlToMap(resultXml);
        outputStream.close();
        inputStream.close();
        Map<String, String> returnData = new HashMap<>();
        if (!WXPayUtil.isSignatureValid(params, "5ea946402f207dfbf9231598100fc9ef", WXPayConstants.SignType.HMACSHA256)) {
            returnData.put("return_code", "FAIL");
            returnData.put("return_msg", "校验失败");

        } else {
            //处理业务
            double money = Double.parseDouble(params.get("total_fee")) / 100;
            String openid = params.get("openid");
            String outtradeno = params.get("out_trade_no");
            String transactionid = params.get("transaction_id");
            if (addMoney(money, openid, outtradeno, transactionid)) {
                returnData.put("return_code", "SUCCESS");
                returnData.put("return_msg", "OK");
            } else {
                returnData.put("return_code", "FAIL");
                returnData.put("return_msg", "数据库写入失败");
            }
        }
        return WXPayUtil.mapToXml(returnData);
    }

    private boolean addMoney(double money, String openid, String outtradeno, String transactionid) {

        return true;
    }

    /**
     * MCH_ID:1600272921
     * MCH_KEY:5ea946402f207dfbf9231598100fc9ef
     *
     * @param request
     * @param openid
     * @param fee
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/pay")
    public Return pay(HttpServletRequest request, @RequestParam("userid") int userid, @RequestParam("openid") String openid, @RequestParam("fee") int fee) {
        try {
            String ip = Util.getIPAddress(request);
            Map<String, String> para = new HashMap<>();
            para.put("body", "学豆充值");
            para.put("spbill_create_ip", ip);
            para.put("openid", openid);
            String tradeno = UUID.randomUUID().toString().replaceAll("-", "");
            para.put("out_trade_no", tradeno);
            para.put("total_fee", fee + "");
            para.put("sign_type", WXPayConstants.HMACSHA256);
            para.put("trade_type", "JSAPI");
            final String SUCCESS_NOTIFY = "http://maixedu.cn/wechat/success";
            WXPayConfig config = new MyWxPayConfig();
            WXPay wxPay = new WXPay(config, SUCCESS_NOTIFY, false);
            Map<String, String> map = wxPay.unifiedOrder(wxPay.fillRequestData(para));
            String prepay_id = map.get("prepay_id");
            Map<String, String> payMap = new HashMap<>();
            payMap.put("appId", "wx04753140ee90a047");
            payMap.put("timeStamp", WXPayUtil.getCurrentTimestamp() + "");
            payMap.put("nonceStr", WXPayUtil.generateNonceStr());
            payMap.put("signType", WXPayConstants.HMACSHA256);
            payMap.put("package", "prepay_id=" + prepay_id);
            String paySign = WXPayUtil.generateSignature(payMap, "5ea946402f207dfbf9231598100fc9ef", WXPayConstants.SignType.HMACSHA256);
            payMap.put("paySign", paySign);
            //创建学豆订单
            if (dealRecordService.insertRecord(userid, fee, "学豆充值", tradeno)) {
                return new Return(Code.Success, payMap, "成功");
            } else {
                return new Return(Code.Fail, payMap, "失败");
            }
        } catch (Exception e) {
            return new Return(Code.Fail, null, "服务器错误");
        }
    }
}
