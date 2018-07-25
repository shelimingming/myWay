package com.myway.controller;

import com.myway.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {
    @RequestMapping("login")
    public String login(User user, HttpServletRequest request, Model model, Map<String, Object> map) {
        System.out.println(user);
        if ("admin".equals(user.getName()) && "123456".equals(user.getPassword())) {

            request.setAttribute("user", user);
            model.addAttribute("name", user.getName());
            map.put("key", "aa");

            //登录成功将信息放入session
            request.getSession().setAttribute("username", user.getName());

            return "/page/success.jsp";
        } else {
            return "login.jsp";
        }
    }

    /*
     * 登录验证
     */
    @ResponseBody
    @RequestMapping(value = "api/get", method = RequestMethod.GET)
    public String get(HttpServletRequest request) {

        String username = (String) request.getSession().getAttribute("username");
        if (!StringUtils.isEmpty(username)) {
            return "登录成功：" + username;
        }
        return "登录失败";
    }
}
