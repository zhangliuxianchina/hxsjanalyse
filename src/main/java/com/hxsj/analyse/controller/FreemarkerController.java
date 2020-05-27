package com.hxsj.analyse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","hello peiqi xihuihui");
        return "welcome";
    }
}
