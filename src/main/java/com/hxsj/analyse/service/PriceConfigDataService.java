package com.hxsj.analyse.service;



import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.PriceConfigData;

import java.util.List;

public interface PriceConfigDataService {

    String update(PriceConfigData priceConfigData);

    int insert(PriceConfigData priceConfigData);

    List<PriceConfigData> finds();

    String delete(String id);

    PriceConfigData findById(String id);
}
