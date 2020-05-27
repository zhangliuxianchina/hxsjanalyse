package com.hxsj.analyse.service.impl;


import com.hxsj.analyse.dao.PriceConfigMapper;
import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.PriceConfigData;
import com.hxsj.analyse.pojo.PriceConfigExample;
import com.hxsj.analyse.service.PriceConfigDataService;
import com.hxsj.analyse.service.PriceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceConfigDataServiceImpl implements PriceConfigDataService {

    @Autowired
    private PriceConfigMapper priceConfigMapper;

    @Override
    public String update(PriceConfigData priceConfigData) {
        return null;
    }

    @Override
    public int insert(PriceConfigData priceConfigData) {
        return 0;
    }

    @Override
    public List<PriceConfigData> finds() {
        return null;
    }

    @Override
    public String delete(String id) {
        return null;
    }

    @Override
    public PriceConfigData findById(String id) {
        return null;
    }
}
