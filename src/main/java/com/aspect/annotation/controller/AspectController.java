package com.aspect.annotation.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jotaiwan on 6/08/2017.
 */
@Controller
public class AspectController {

    @RequestMapping(value="/aspect")
    public String aspectView() {
        System.out.println("show aspect");
        return "aspect";
    }
}
