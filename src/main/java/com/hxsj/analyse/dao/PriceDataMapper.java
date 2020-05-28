package com.hxsj.analyse.dao;

import com.hxsj.analyse.pojo.PriceData;
import com.hxsj.analyse.pojo.PriceDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceDataMapper {
    int countByExample(PriceDataExample example);

    int deleteByExample(PriceDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PriceData record);

    int insertSelective(PriceData record);

    List<PriceData> selectByExample(PriceDataExample example);

    PriceData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PriceData record, @Param("example") PriceDataExample example);

    int updateByExample(@Param("record") PriceData record, @Param("example") PriceDataExample example);

    int updateByPrimaryKeySelective(PriceData record);

    int updateByPrimaryKey(PriceData record);
}