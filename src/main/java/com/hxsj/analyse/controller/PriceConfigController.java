package com.hxsj.analyse.controller;

import com.hxsj.analyse.pojo.ParentTypeConfig;
import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.ProductTypeConfig;
import com.hxsj.analyse.service.ParentTypeConfigService;
import com.hxsj.analyse.service.PriceConfigService;
import com.hxsj.analyse.service.ProductTypeConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@Controller
public class PriceConfigController {

    @Autowired
    private PriceConfigService priceConfigservice;

    @Autowired
    private ParentTypeConfigService parentTypeConfigService;

    @Autowired
    private ProductTypeConfigService productTypeConfigService;

    @GetMapping(value = "/toPriceConfig")
    public String update(String id,Model model) {
        if(!StringUtils.isEmpty(id)){
            PriceConfig priceConfig = priceConfigservice.findById(id);
            model.addAttribute("priceConfig",priceConfig == null ?null :priceConfig);
        }
        model.addAttribute("parentTypes",parentTypeConfigService.finds());
        model.addAttribute("productTypes",productTypeConfigService.finds());
        return "hxsj/priceConfig/addPriceConfigList";
    }


    @PutMapping(value = "/priceConfig")//put
    public String update(PriceConfig priceConfig) {
        ParentTypeConfig parentTypeConfig =parentTypeConfigService.findByType(priceConfig.getParentType());
        priceConfig.setParentTypeDesc(parentTypeConfig.getParentTypeDesc());
        ProductTypeConfig productTypeConfig = productTypeConfigService.findByType(priceConfig.getProductType());
        priceConfig.setProductTypeDesc(productTypeConfig.getProductTypeDesc());
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
        model.addAttribute("parentTypes",parentTypeConfigService.finds());
        model.addAttribute("productTypes",productTypeConfigService.finds());
        return "hxsj/priceConfig/addPriceConfigList";
    }

    @PostMapping(value = "/priceConfig")//post
    public String insert(PriceConfig priceConfig) {
        ParentTypeConfig parentTypeConfig =parentTypeConfigService.findByType(priceConfig.getParentType());
        priceConfig.setParentTypeDesc(parentTypeConfig.getParentTypeDesc());
        ProductTypeConfig productTypeConfig = productTypeConfigService.findByType(priceConfig.getProductType());
        priceConfig.setProductTypeDesc(productTypeConfig.getProductTypeDesc());
        priceConfigservice.insert(priceConfig);
        return "redirect:/priceConfigs";
    }

    @GetMapping("/priceConfigs")//get
    public String listPriceConfigs(Model model){
        model.addAttribute("priceConfigs",priceConfigservice.finds());
        return "hxsj/priceConfig/priceConfigList";
    }

    @GetMapping("/priceConfig")//get
    public String priceConfig(String id,Model model){
        model.addAttribute("priceConfig",priceConfigservice.findById(id));
        return "redirect:/hxsj/priceConfigList";
    }
}
