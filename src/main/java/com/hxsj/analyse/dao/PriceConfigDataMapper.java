package com.hxsj.analyse.dao;

import com.hxsj.analyse.pojo.PriceConfigData;
import com.hxsj.analyse.pojo.PriceConfigDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceConfigDataMapper {
    int countByExample(PriceConfigDataExample example);

    int deleteByExample(PriceConfigDataExample example);

    int insert(PriceConfigData record);

    int insertSelective(PriceConfigData record);

    List<PriceConfigData> selectByExample(PriceConfigDataExample example);

    int updateByExampleSelective(@Param("record") PriceConfigData record, @Param("example") PriceConfigDataExample example);

    int updateByExample(@Param("record") PriceConfigData record, @Param("example") PriceConfigDataExample example);
}