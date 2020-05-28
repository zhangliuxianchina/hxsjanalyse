package com.hxsj.analyse.service.impl;


import com.hxsj.analyse.dao.PriceConfigMapper;
import com.hxsj.analyse.dao.ProductTypeConfigMapper;
import com.hxsj.analyse.pojo.*;
import com.hxsj.analyse.service.PriceConfigService;
import com.hxsj.analyse.service.ProductTypeConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeConfigServiceImpl implements ProductTypeConfigService {

    @Autowired
    private ProductTypeConfigMapper productTypeConfigMapper;


    @Override
    public String update(ProductTypeConfig productTypeConfig) {
        return null;
    }

    @Override
    public int insert(ProductTypeConfig productTypeConfig) {
        return 0;
    }

    @Override
    public List<ProductTypeConfig> finds() {
        ProductTypeConfigExample example = new ProductTypeConfigExample();
        List<ProductTypeConfig> productTypeConfigs = productTypeConfigMapper.selectByExample(example);
        return productTypeConfigs;
    }

    @Override
    public String delete(String id) {
        return null;
    }

    @Override
    public ProductTypeConfig findById(String id) {
        return null;
    }

    @Override
    public ProductTypeConfig findByType(String productType) {
        ProductTypeConfigExample example = new ProductTypeConfigExample();
        example.createCriteria().andProductTypeEqualTo(productType);
        List<ProductTypeConfig> productTypeConfigs = productTypeConfigMapper.selectByExample(example);
        return productTypeConfigs.get(0);
    }
}
