package com.hxsj.analyse.service;



import com.hxsj.analyse.pojo.ParentTypeConfig;

import java.util.List;

public interface ParentTypeConfigService {

    String update(ParentTypeConfig parentTypeConfig);

    int insert(ParentTypeConfig parentTypeConfig);

    List<ParentTypeConfig> finds();

    String delete(String id);

    ParentTypeConfig findById(String id);
}
