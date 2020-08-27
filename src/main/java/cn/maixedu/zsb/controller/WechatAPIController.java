package cn.maixedu.zsb.controller;

import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.ReturnFormat;
import com.alibaba.fastjson.JSON;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;

/**
 * @Description: 微信小程序权限请求接口
 * code2session：登录凭证校验。通过 wx.login 接口获得临时登录凭证 code 后传到开发者服务器调用此接口完成登录流程。
 * @Author:lw
 * @Date:2020/8/28
 */
@Controller
@RequestMapping("/wechat")
public class WechatAPIController {
    @ResponseBody
    @RequestMapping("/code2session")
    public ReturnFormat code2session(@RequestParam("code") String code){
        if(code ==null || "".equals(code)){
            return new ReturnFormat(Code.FAIL,null,"请提交正确的数据");
        }
        else {
            try{
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder()
                        .url("https://api.weixin.qq.com/sns/jscode2session?appid=wx04753140ee90a047&secret=SECRET&js_code=JSCODE&grant_type=authorization_code")
                        .build();
                Response response = client.newCall(request).execute();
                okhttp3.ResponseBody body = response.body();
                if(body == null){
                    return new ReturnFormat(Code.FAIL,null,"请求api.weixin.qq.com/sns/jscode2session失败");
                }else{
                    String rt =  body.string();
                    Type result =  JSON.parseObject(rt,Type.class);
                    if(result.errcode == 0){
                        return new ReturnFormat(Code.SUCCESS,result,"获取session成功");
                    }
                    else{
                        return new ReturnFormat(Code.FAIL,result,"获取session失败");
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
                return new ReturnFormat(Code.FAIL,null,e.toString());
            }
        }
    }
}
class Type{
    String openid;
    String session_key;
    String unionid;
    int errcode;
    String errmsg;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
