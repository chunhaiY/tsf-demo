package com.example.provider.controller;

import com.example.provider.properties.ProviderNameConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    ProviderNameConfig providerNameConfig;

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return string;
    }

    @GetMapping("/providerName")
    public String providerName(){
        return providerNameConfig.getName();
    }

}