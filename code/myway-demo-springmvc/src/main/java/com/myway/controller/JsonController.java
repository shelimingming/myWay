package com.myway.controller;

import com.myway.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("json")
public class JsonController {
    @RequestMapping("getJson")
    @ResponseBody
    public User getJson() {
        User user = new User();
        user.setName("佘黎明");
        user.setPassword("123456");
        return user;
    }

    @RequestMapping("getMap")
    @ResponseBody
    public Map getMap() {
        Map<String ,Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("age","12");

        return map;
    }
}
