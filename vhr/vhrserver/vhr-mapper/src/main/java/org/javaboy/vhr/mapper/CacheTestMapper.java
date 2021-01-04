package org.javaboy.vhr.mapper;

import org.javaboy.vhr.model.HrRole;

import java.util.List;

public interface CacheTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    List<HrRole> getCacheTest();
}
