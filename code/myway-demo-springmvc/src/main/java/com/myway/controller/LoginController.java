package com.myway.controller;

import com.myway.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(User user, HttpServletRequest request, Model model, Map<String ,Object> map) {
        System.out.println(user);
        if("admin".equals(user.getName())&&"123456".equals(user.getPassword())) {

            request.setAttribute("user",user);
            model.addAttribute("name" ,user.getName());
            map.put("key","aa");

            return "/page/success.jsp";
        } else {
            return "login.jsp";
        }
    }
}
