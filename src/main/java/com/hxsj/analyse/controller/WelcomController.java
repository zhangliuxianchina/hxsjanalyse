package com.hxsj.analyse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomController {

    @RequestMapping(value = "welcome", method = RequestMethod.GET)
    public String show(Model model){

        return "welcome";
    }

}
