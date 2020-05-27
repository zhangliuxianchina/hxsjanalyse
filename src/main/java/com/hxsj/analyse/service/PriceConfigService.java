package com.hxsj.analyse.service;



import com.hxsj.analyse.pojo.PriceConfig;

import java.util.List;

public interface PriceConfigService {

    String update(PriceConfig priceConfig);

    int insert(PriceConfig priceConfig);

    List<PriceConfig> finds();

    String delete(String priceConfigId);

    PriceConfig findById(String id);
}
