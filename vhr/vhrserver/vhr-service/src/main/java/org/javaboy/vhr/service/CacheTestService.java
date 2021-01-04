package org.javaboy.vhr.service;

import org.javaboy.vhr.mapper.CacheTestMapper;
import org.javaboy.vhr.model.HrRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "cache_test")
public class CacheTestService {

    @Autowired
    CacheTestMapper cacheTestMapper;

    @Cacheable
    public List<HrRole> getHrRoleList(){
        return cacheTestMapper.getCacheTest();
    }
}
