package com.hxsj.analyse.service;




import com.hxsj.analyse.pojo.PriceData;

import java.util.List;

public interface PriceDataService {

    String update(PriceData priceData);

    int insert(PriceData priceData);

    List<PriceData> finds();

    String delete(String id);

    List<PriceData> findByParam(PriceData priceData);

    PriceData findById(String id);
}
