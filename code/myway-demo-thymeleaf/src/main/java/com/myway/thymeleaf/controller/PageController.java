package com.myway.thymeleaf.controller;

import com.myway.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/")
    public String page() {
        return "index";
    }

    /**
     * 视图
     *
     * @param model
     * @return
     */
    @RequestMapping("/hello")
    public String hello(Model model) {
        User user = new User("sheliming", 24);

        model.addAttribute("name", "myway");
        model.addAttribute("user", user);
        return "hello/hello";
    }
}