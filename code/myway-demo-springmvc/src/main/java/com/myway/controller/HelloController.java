package com.myway.controller;

import com.myway.domain.User;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller // 如果一个普通类被@Controller注解，则普通类变成一个servlet
@Scope("prototype") //指定单例多例
public class HelloController {
    @RequestMapping(value = {"/hello", "/a.shtml"}, method = RequestMethod.GET)  // 为当前方法配置一个对外访问的虚拟路径
    public void regiter(@RequestParam(name = "username", defaultValue = "test", required = false) String name) {
        System.out.println(name);
    }

    @RequestMapping("send")
    public void send(User user, HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(user);
        //servlet重定向
        //request.getRequestDispatcher("/page/success.jsp").forward(request,response);

        //servlet转发
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+ "/page/success.jsp");

    }

    @RequestMapping("send2")
    public String send2(User user) throws Exception {
        System.out.println(user);

        //springmvc 重定向
        //return "redirect:/page/success.jsp";

        //springmvc默认转发
        return "/page/success.jsp";
    }


    @RequestMapping("error")
    public void error() throws Exception {
       int i=1/0;
    }


}
