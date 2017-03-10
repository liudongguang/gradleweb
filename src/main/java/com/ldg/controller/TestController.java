package com.ldg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liudo on 2017/3/10 0010.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/ok")
    public String ok() {
        System.out.println("okkkkkkkkk111111----------->");
        return "/index.jsp";
    }
}
