package com.hxsj.analyse.dao;

import com.hxsj.analyse.pojo.ParentTypeConfig;
import com.hxsj.analyse.pojo.ParentTypeConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParentTypeConfigMapper {
    int countByExample(ParentTypeConfigExample example);

    int deleteByExample(ParentTypeConfigExample example);

    int insert(ParentTypeConfig record);

    int insertSelective(ParentTypeConfig record);

    List<ParentTypeConfig> selectByExample(ParentTypeConfigExample example);

    int updateByExampleSelective(@Param("record") ParentTypeConfig record, @Param("example") ParentTypeConfigExample example);

    int updateByExample(@Param("record") ParentTypeConfig record, @Param("example") ParentTypeConfigExample example);
}