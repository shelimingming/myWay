package com.myway.service.impl;

import com.myway.dao.MenuDoMapper;
import com.myway.domain.MenuDo;
import com.myway.domain.MenuDoExample;
import com.myway.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuDoMapper menuDoMapper;

    public List<MenuDo> getMenuList() {
        MenuDoExample menuDoExample = new MenuDoExample();
        List<MenuDo> menuDos = menuDoMapper.selectByExample(menuDoExample);
        return menuDos;
    }
}
