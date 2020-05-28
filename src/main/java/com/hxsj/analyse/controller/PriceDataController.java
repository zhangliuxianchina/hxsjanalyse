package com.hxsj.analyse.controller;

import com.hxsj.analyse.pojo.ParentTypeConfig;
import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.PriceData;
import com.hxsj.analyse.pojo.ProductTypeConfig;
import com.hxsj.analyse.service.ParentTypeConfigService;
import com.hxsj.analyse.service.PriceDataService;
import com.hxsj.analyse.service.ProductTypeConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PriceDataController {

    @Autowired
    private PriceDataService priceDataService;

    @Autowired
    private ParentTypeConfigService parentTypeConfigService;

    @Autowired
    private ProductTypeConfigService productTypeConfigService;


    @GetMapping(value = "/toPriceData")
    public String update(String id,Model model) {
        PriceData priceData = new PriceData();
        model.addAttribute("priceData",priceDataService.findById(id));
        model.addAttribute("parentTypes",parentTypeConfigService.finds());
        model.addAttribute("productTypes",productTypeConfigService.finds());
        return "hxsj/priceData/addPriceDataList";
    }
    @GetMapping(value = "/toPriceData1")
    public String toadd(String id,Model model) {

        model.addAttribute("parentTypes",parentTypeConfigService.finds());
        model.addAttribute("productTypes",productTypeConfigService.finds());
        return "hxsj/priceData/addPriceDataList";
    }

    @PostMapping(value = "/priceData")//post
    public String insert(PriceData priceData) {
        priceData.setIsDelete("0");
        addDesc(priceData);
        priceDataService.insert(priceData);
        return "redirect:/priceDatas";
    }


    @PutMapping(value = "/priceData")//post
    public String update(PriceData priceData) {
        addDesc(priceData);
        priceDataService.update(priceData);
        return "redirect:/priceDatas";
    }
    @DeleteMapping(value = "/priceData/{id}")//Delete
    public String update(@PathVariable("id")String id) {
        PriceData priceData = priceDataService.findById(id);
        priceData.setIsDelete("1");
        priceDataService.update(priceData);
        return "redirect:/priceDatas";
    }

    @GetMapping("/priceDatas")//get
    public String listPriceDatas(Model model,PriceData priceData){
        model.addAttribute("priceDatas",priceDataService.findByParam(priceData));
        return "hxsj/priceData/price";
    }


    private void addDesc(PriceData priceData) {
        ParentTypeConfig parentTypeConfig =parentTypeConfigService.findByType(priceData.getParentType());
        priceData.setParentTypeDesc(parentTypeConfig.getParentTypeDesc());
        ProductTypeConfig productTypeConfig = productTypeConfigService.findByType(priceData.getProductType());
        priceData.setProductTypeDesc(productTypeConfig.getProductTypeDesc());
    }

}
