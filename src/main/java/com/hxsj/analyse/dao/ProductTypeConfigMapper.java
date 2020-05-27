package com.hxsj.analyse.dao;

import com.hxsj.analyse.pojo.ProductTypeConfig;
import com.hxsj.analyse.pojo.ProductTypeConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeConfigMapper {
    int countByExample(ProductTypeConfigExample example);

    int deleteByExample(ProductTypeConfigExample example);

    int insert(ProductTypeConfig record);

    int insertSelective(ProductTypeConfig record);

    List<ProductTypeConfig> selectByExample(ProductTypeConfigExample example);

    int updateByExampleSelective(@Param("record") ProductTypeConfig record, @Param("example") ProductTypeConfigExample example);

    int updateByExample(@Param("record") ProductTypeConfig record, @Param("example") ProductTypeConfigExample example);
}