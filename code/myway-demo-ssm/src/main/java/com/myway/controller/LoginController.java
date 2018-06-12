package com.myway.controller;

import com.myway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    public String login(String username, String password) {
        System.out.println("username:" + username + ".password=" + password);
        boolean loginRes = userService.login(username, password);
        System.out.println("loginRes:" + loginRes);
        if (loginRes) {
            return "index.jsp";
        } else {
            return "../../login.jsp";
        }
    }

    @RequestMapping("loginBoolean")
    @ResponseBody
    public Boolean loginBoolean(String username, String password) {
        System.out.println("username:" + username + ".password=" + password);
        return userService.login(username, password);
    }

    @RequestMapping("test")
    public String test() {
        System.out.println("testtttttttttttttttt");
        return "test";
    }
}
