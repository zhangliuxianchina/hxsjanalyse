package com.hxsj.analyse.service;



import com.hxsj.analyse.pojo.ParentTypeConfig;
import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.ProductTypeConfig;

import java.util.List;

public interface ProductTypeConfigService {

    String update(ProductTypeConfig productTypeConfig);

    int insert(ProductTypeConfig productTypeConfig);

    List<ProductTypeConfig> finds();

    String delete(String id);

    ProductTypeConfig findById(String id);

    ProductTypeConfig findByType(String productType);
}
