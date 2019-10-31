package com.example.thymeleafdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author wwp
 * @Date 2019-10-26
 * @Version V1.0
 **/
@Controller
@Slf4j
public class TestController {

    //private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("test")
    public String test(){
        log.info("日志");
        log.debug("日志");
        log.warn("日志");
        log.error("日志");
        log.trace("日志");
        return "page/index";
    }
}
