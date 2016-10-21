package com.sogyo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ep53rn on 21-10-2016.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }
}
