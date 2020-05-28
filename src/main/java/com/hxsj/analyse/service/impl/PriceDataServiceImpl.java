package com.hxsj.analyse.service.impl;



import com.hxsj.analyse.dao.PriceDataMapper;
import com.hxsj.analyse.pojo.PriceData;
import com.hxsj.analyse.pojo.PriceDataExample;
import com.hxsj.analyse.service.PriceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;


@Service
public class PriceDataServiceImpl implements PriceDataService {


    @Autowired
    private PriceDataMapper priceDataMapper;

    @Override
    public String update(PriceData priceData) {
        PriceDataExample example = new PriceDataExample();
        example.createCriteria().andIdEqualTo(priceData.getId());
        priceDataMapper.updateByExample(priceData,example);
        return priceData.getId()+"";
    }

    @Override
    public int insert(PriceData priceData) {
        priceDataMapper.insert(priceData);
        return priceData.getId();
    }

    @Override
    public List<PriceData> finds() {
        return null;
    }

    @Override
    public String delete(String id) {
        return null;
    }

    @Override
    public List<PriceData> findByParam(PriceData priceData) {
        PriceDataExample example = new PriceDataExample();
        PriceDataExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeleteEqualTo("0");
        if(!StringUtils.isEmpty(priceData.getId())){
            criteria.andIdEqualTo(priceData.getId());
        }
        if(!StringUtils.isEmpty(priceData.getApplyId())){
            criteria.andApplyIdEqualTo(priceData.getApplyId());
        }
        if(!StringUtils.isEmpty(priceData.getParentType())){
            criteria.andParentTypeEqualTo(priceData.getParentType());
        }
        if(!StringUtils.isEmpty(priceData.getProductType())){
            criteria.andProductTypeEqualTo(priceData.getProductType());
        }
        if(!StringUtils.isEmpty(priceData.getCustomeName())){
            criteria.andCustomeEmailLike(priceData.getCustomeName());
        }
        List<PriceData> priceDatas = priceDataMapper.selectByExample(example);
        return priceDatas;
    }

    @Override
    public PriceData findById(String id) {
        PriceDataExample example = new PriceDataExample();
        PriceDataExample.Criteria criteria = example.createCriteria();
        criteria.andIsDeleteEqualTo("0");
        criteria.andIdEqualTo(Integer.parseInt(id));
        List<PriceData> priceDatas = priceDataMapper.selectByExample(example);
        return priceDatas.get(0);
    }
}
