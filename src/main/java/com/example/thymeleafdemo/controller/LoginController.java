package com.example.thymeleafdemo.controller;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.thymeleafdemo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

/**
 * @ClassName LoginController
 * @Description: TODO
 * @Author wwp
 * @Date 2019-10-30
 * @Version V1.0
 **/
@Controller
@Slf4j
public class LoginController {

    @Autowired
    protected HttpServletRequest request;
    @Autowired
    private DataSource dataSource;

    @RequestMapping("/")
    public String toLogin(){
        log.info("登录页面");
        return "page/login";
    }

    @RequestMapping("/login")
    public String login(User user){
        log.info("登录");
        if (user != null){
            request.getSession().setAttribute("user",user);
        }
        return "page/index";
    }
}
