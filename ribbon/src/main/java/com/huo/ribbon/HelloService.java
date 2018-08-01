package com.huo.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lizheng on 2017/7/21.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String helloService() {
        return restTemplate.getForObject("http://SERVICE-HI/hi", String.class);
    }

    public String helloFallBack() {
        return "Error occurred ！";
    }

}