package com.aspect.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by jotaiwan on 6/08/2017.
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {
    @RequestMapping(value = "/*", method = RequestMethod.GET)
    public ModelAndView indexView(HttpServletRequest request, HttpSession session) {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}