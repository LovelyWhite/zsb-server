package cn.maixedu.zsb.interceptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.maixedu.zsb.model.User;
import cn.maixedu.zsb.model.view.UserDetail;
import cn.maixedu.zsb.utils.Code;
import cn.maixedu.zsb.utils.Return;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import cn.maixedu.zsb.utils.JWT;
import com.alibaba.fastjson.JSONObject;

/**
 * @Description: Token 拦截器
 * @Author:lw
 * @Date:2020/8/29
 */
public class TokenInterceptor implements HandlerInterceptor {
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception arg3)
            throws Exception {
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView model) throws Exception {
    }

    //拦截每个请求
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws IOException {
        String token = request.getHeader("token");
        //token不存在
        if(null != token) {
            UserDetail user = JWT.unsign(token, UserDetail.class);
            if(user == null){
               PrintWriter out =  response.getWriter();
                out.print(JSONObject.toJSONString(new Return(Code.TokenExpired,null,"Token失效")));
                out.flush();
                out.close();
                return false;
            }else {
                return true;
            }
        }
        else {
            PrintWriter out =  response.getWriter();
            out.print(JSONObject.toJSONString(new Return(Code.Fail,null,"token为空")));
            out.flush();
            out.close();
            return false;
        }
    }

}

