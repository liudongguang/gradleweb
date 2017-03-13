package com.ldg.controller;

import com.sdey.api.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liudo on 2017/3/10 0010.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestService tsv;
    @RequestMapping(value = "/ok")
    public String ok() {
        System.out.println("okkkkkkkkk111111----------->"+tsv.getAll());
        return "/index.jsp";
    }
}
