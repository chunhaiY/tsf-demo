package com.example.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.provider.domain.TsfUser;
import com.example.provider.service.TsfUserService;
import com.example.provider.mapper.TsfUserMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class TsfUserServiceImpl extends ServiceImpl<TsfUserMapper, TsfUser>
    implements TsfUserService{

}




