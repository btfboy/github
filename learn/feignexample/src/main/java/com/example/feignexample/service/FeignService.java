package com.example.feignexample.service;

import com.example.feignexample.service.fallback.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "client",fallback = FeignFallback.class)
public interface FeignService {

    @RequestMapping(value="/test/method")
    String saySomthingFrom();
}
