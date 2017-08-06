package com.aspect.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jotaiwan on 6/08/2017.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "home";
    }
}
