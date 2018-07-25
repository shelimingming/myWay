package com.myway.controller;

import com.myway.domain.MenuDo;
import com.myway.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("getMenuList")
    public void getMenuList() {
        List<MenuDo> menuList = menuService.getMenuList();
        System.out.println(menuList);
    }
}
