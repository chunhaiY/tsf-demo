package com.example.provider.controller;

import org.checkerframework.checker.units.qual.K;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {

    private static final String KEY = "AKey";
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping
    public String get(){
        return stringRedisTemplate.opsForValue().get(KEY);
    }

    @PostMapping
    public String set(String value){
        stringRedisTemplate.opsForValue().set(KEY, value);
        return get();
    }
}
