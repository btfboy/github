package com.example.feignexample.service.fallback;

import com.example.feignexample.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements FeignService {
    @Override
    public String saySomthingFrom() {
        return "触发熔断!";
    }
}
