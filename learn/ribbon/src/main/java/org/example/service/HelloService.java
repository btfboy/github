package org.example.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService() {
        return restTemplate.getForObject("http://CLIENT/test/method", String.class);
    }

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String getList(){
        return restTemplate.getForObject("http://CLIENT/test/method", String.class);
    }

    public String fallbackMethod(){
        return "熔断模式";
    }

}
