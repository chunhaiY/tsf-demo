package com.example.consumer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.consumer.domain.TsfUser;
import com.example.consumer.service.TsfUserService;
import com.example.consumer.mapper.TsfUserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class TsfUserServiceImpl extends ServiceImpl<TsfUserMapper, TsfUser>
    implements TsfUserService{

}




