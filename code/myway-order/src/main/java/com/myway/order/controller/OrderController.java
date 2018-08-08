package com.myway.order.controller;

import com.myway.order.domain.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/user/{id}")
    public UserDO findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://myway-RBAC/sys/user/get?id=" + id, UserDO.class);
        //return this.restTemplate.getForObject("http://localhost:8001/sys/user/get?id=" + id, UserDO.class);
    }
}
