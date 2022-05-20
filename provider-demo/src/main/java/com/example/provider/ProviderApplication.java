package com.example.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.tsf.annotation.EnableTsf;
import org.springframework.tsf.auth.annotation.EnableTsfAuth;

@EnableTsf
@SpringBootApplication
@EnableTsfAuth
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class);
    }

}
