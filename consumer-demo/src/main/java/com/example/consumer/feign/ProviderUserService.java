package com.example.consumer.feign;

import com.example.consumer.domain.TsfUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "provider-demo")
public interface ProviderUserService {

    @GetMapping("/tsfuser/list")
    public List<TsfUser> list();

}
