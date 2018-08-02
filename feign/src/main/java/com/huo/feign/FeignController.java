package com.huo.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private ServiceFeign serviceFeign;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return serviceFeign.sayHi(name);
    }
}
