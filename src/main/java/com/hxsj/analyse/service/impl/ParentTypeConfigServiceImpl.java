package com.hxsj.analyse.service.impl;


import com.hxsj.analyse.dao.ParentTypeConfigMapper;
import com.hxsj.analyse.dao.PriceConfigMapper;
import com.hxsj.analyse.pojo.ParentTypeConfig;
import com.hxsj.analyse.pojo.ParentTypeConfigExample;
import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.PriceConfigExample;
import com.hxsj.analyse.service.ParentTypeConfigService;
import com.hxsj.analyse.service.PriceConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentTypeConfigServiceImpl implements ParentTypeConfigService {

    @Autowired
    private ParentTypeConfigMapper parentTypeConfigMapper;


    @Override
    public String update(ParentTypeConfig parentTypeConfig) {
        return null;
    }

    @Override
    public int insert(ParentTypeConfig parentTypeConfig) {
        return 0;
    }

    @Override
    public List<ParentTypeConfig> finds() {
        ParentTypeConfigExample example = new ParentTypeConfigExample();
        List<ParentTypeConfig> parentTypeConfigs = parentTypeConfigMapper.selectByExample(example);
        return parentTypeConfigs;
    }

    @Override
    public String delete(String id) {
        return null;
    }

    @Override
    public ParentTypeConfig findById(String id) {
        return null;
    }

    @Override
    public ParentTypeConfig findByType(String parentType) {
        ParentTypeConfigExample example = new ParentTypeConfigExample();
        example.createCriteria().andParentTypeEqualTo(parentType);
        List<ParentTypeConfig> parentTypeConfigs = parentTypeConfigMapper.selectByExample(example);
        return parentTypeConfigs.get(0);
    }
}
