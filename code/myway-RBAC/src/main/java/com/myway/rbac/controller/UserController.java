package com.myway.rbac.controller;

import com.myway.rbac.domain.UserDO;
import com.myway.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sys/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public UserDO get(Long id) {
        UserDO user = userService.get(id);
        return user;
    }
}
