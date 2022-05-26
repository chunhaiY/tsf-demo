package com.example.provider.controller;

import com.example.provider.domain.TsfUser;
import com.example.provider.service.TsfUserService;
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


    @GetMapping("/list")
    public List<TsfUser> list() {
        return tsfUserService.lambdaQuery().list();
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
