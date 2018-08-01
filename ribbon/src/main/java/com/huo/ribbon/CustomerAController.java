package com.huo.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * Created by lizheng on 2017/7/20.
 */
@RestController
public class CustomerAController {
 
    @Autowired
    HelloService service;
 
    @RequestMapping("/ribbon-consumer")
    public String coutomerA() {
        return service.helloService();
    }
 
}