package com.example.consumer.controller;

import com.example.consumer.domain.TsfUser;
import com.example.consumer.feign.ProviderUserService;
import com.example.consumer.service.TsfUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tsfuser")
public class TsfUserController {

    @Autowired
    TsfUserService tsfUserService;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    ProviderUserService providerUserService;


    @GetMapping("/list")
    public List<TsfUser> list() {
        List<TsfUser> list = tsfUserService.lambdaQuery().list();
        return list;
    }


    @PostMapping("/add")
    public void add(TsfUser tsfUser) {
        tsfUserService.save(tsfUser);
    }


    @PostMapping("/update")
    public void update(TsfUser tsfUser) {
        tsfUserService.updateById(tsfUser);
    }

    @PostMapping("/delete")
    public void delete(TsfUser tsfUser) {
        tsfUserService.removeById(tsfUser);
    }
}
