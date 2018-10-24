package com.myway.rbac.controller;

import com.myway.rbac.common.utils.PageUtils;
import com.myway.rbac.common.utils.Query;
import com.myway.rbac.domain.UserDO;
import com.myway.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/sys/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get")
    public UserDO get(Integer id) {
        UserDO user = userService.get(id);
        return user;
    }

    @GetMapping("/list")
    @ResponseBody
    PageUtils list(@RequestParam Map<String, Object> params) {
        // 查询列表数据
        Query query = new Query(params);
        List<UserDO> sysUserList = userService.list(query);
        int total = userService.count(query);
        PageUtils pageUtil = new PageUtils(sysUserList, total);
        return pageUtil;
    }
}
