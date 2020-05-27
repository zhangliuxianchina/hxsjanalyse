package com.hxsj.analyse.service.impl;


import com.hxsj.analyse.dao.PriceConfigMapper;
import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.PriceConfigExample;
import com.hxsj.analyse.service.PriceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceConfigServiceImpl implements PriceConfigService {

    @Autowired
    private PriceConfigMapper priceConfigMapper;

    @Override
    public String update(PriceConfig priceConfig) {
        PriceConfigExample example = new PriceConfigExample();
        PriceConfigExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(priceConfig.getId());
        priceConfigMapper.updateByExample(priceConfig,example);
        return "1";
    }

    @Override
    public int insert(PriceConfig priceConfig) {
        priceConfigMapper.insert(priceConfig);
        return priceConfig.getId();
    }

    @Override
    public List<PriceConfig> finds() {
        PriceConfigExample example = new PriceConfigExample();
        List<PriceConfig> priceConfigs = priceConfigMapper.selectByExample(example);
        return priceConfigs;
    }

    @Override
    public String delete(String priceConfigId) {
        PriceConfigExample example = new PriceConfigExample();
        PriceConfigExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(Integer.parseInt(priceConfigId));
        priceConfigMapper.deleteByExample(example);
        return "1";
    }

    @Override
    public PriceConfig findById(String priceConfigId) {
        PriceConfigExample example = new PriceConfigExample();
        PriceConfigExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(Integer.parseInt(priceConfigId));
        List<PriceConfig> priceConfigs = priceConfigMapper.selectByExample(example);
        return priceConfigs.get(0);
    }
}
