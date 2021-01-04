package org.javaboy.vhr.controller.cache_test;

import org.javaboy.vhr.model.HrRole;
import org.javaboy.vhr.model.RespBean;
import org.javaboy.vhr.service.CacheTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cache_test")
public class CacheTestController {

    @Autowired
    private CacheTestService cacheTestService;

    @PostMapping("/test")
    public RespBean test() {
        List<HrRole> list = cacheTestService.getHrRoleList();
        return RespBean.ok("查询成功!",list);
    }
}
