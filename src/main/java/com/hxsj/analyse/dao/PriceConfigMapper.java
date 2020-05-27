package com.hxsj.analyse.dao;

import com.hxsj.analyse.pojo.PriceConfig;
import com.hxsj.analyse.pojo.PriceConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PriceConfigMapper {
    int countByExample(PriceConfigExample example);

    int deleteByExample(PriceConfigExample example);

    int insert(PriceConfig record);

    int insertSelective(PriceConfig record);

    List<PriceConfig> selectByExample(PriceConfigExample example);

    int updateByExampleSelective(@Param("record") PriceConfig record, @Param("example") PriceConfigExample example);

    int updateByExample(@Param("record") PriceConfig record, @Param("example") PriceConfigExample example);
}