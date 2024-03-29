package com.example.thymeleafdemo.interceptor;

import com.example.thymeleafdemo.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName LoginInterceptor
 * @Description: TODO
 * @Author wwp
 * @Date 2019-10-30
 * @Version V1.0
 **/
@Component
public class LoginInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) request.getSession().getAttribute("user");
        if (user != null){
            return true;
        }else {
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }
    }
}
