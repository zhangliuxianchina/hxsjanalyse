package com.hxsj.analyse.controller;

import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.service.PriceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PriceConfigController {

    @Autowired
    private PriceConfigService priceConfigservice;


    @GetMapping(value = "/toPriceConfig")
    public String update(String id,Model model) {
        if(!StringUtils.isEmpty(id)){
            PriceConfig priceConfig = priceConfigservice.findById(id);
            model.addAttribute("priceConfig",priceConfig == null ?null :priceConfig);
        }
        List<String> parentTypes = new ArrayList<>();
        parentTypes.add("msx");
        parentTypes.add("jc");
        parentTypes.add("xg");
        parentTypes.add("yy");
        parentTypes.add("dy");
        parentTypes.add("eyljhg");
        parentTypes.add("dyljhg");
        parentTypes.add("yxljhg");
        parentTypes.add("yxljhgjy");
        parentTypes.add("tsxyzfx");
        parentTypes.add("yzxyzfx");
        parentTypes.add("sjcl");
        model.addAttribute("parentTypes",parentTypes);
        return "hxsj/addPriceConfigList";
    }


    @PutMapping(value = "/priceConfig")//put
    public String update(PriceConfig priceConfig) {
        priceConfigservice.update(priceConfig);
        return "redirect:/priceConfigs";
    }

    @DeleteMapping(value = "/priceConfig/{id}")//delete
    public String delete(@PathVariable("id") String id,Model model) {
        priceConfigservice.delete(id);
        return "redirect:/priceConfigs";
    }

    @GetMapping(value = "/toPriceConfig1")
    public String insert(Model model) {
        List<String> parentTypes = new ArrayList<>();
        parentTypes.add("msx");
        parentTypes.add("jc");
        parentTypes.add("xg");
        parentTypes.add("yy");
        parentTypes.add("dy");
        parentTypes.add("eyljhg");
        parentTypes.add("dyljhg");
        parentTypes.add("yxljhg");
        parentTypes.add("yxljhgjy");
        parentTypes.add("tsxyzfx");
        parentTypes.add("yzxyzfx");
        parentTypes.add("sjcl");
        model.addAttribute("parentTypes",parentTypes);
        return "hxsj/addPriceConfigList";
    }

    @PostMapping(value = "/priceConfig")//post
    public String insert(PriceConfig priceConfig) {
        priceConfigservice.insert(priceConfig);
        return "redirect:/priceConfigs";
    }

    @GetMapping("/priceConfigs")//get
    public String listPriceConfigs(Model model){
        model.addAttribute("priceConfigs",priceConfigservice.finds());
        return "hxsj/priceConfigList";
    }

    @GetMapping("/priceConfig")//get
    public String priceConfig(String id,Model model){
        model.addAttribute("priceConfig",priceConfigservice.findById(id));
        return "redirect:/hxsj/priceConfigList";
    }
}
