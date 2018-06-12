package com.myway.service.impl;

import com.myway.dao.UserDoMapper;
import com.myway.domain.UserDo;
import com.myway.domain.UserDoExample;
import com.myway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDoMapper userDoMapper;

    public boolean login(String username, String password) {
        UserDoExample userDoExample = new UserDoExample();
        userDoExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);

        List<UserDo> userDos = userDoMapper.selectByExample(userDoExample);
        if (!CollectionUtils.isEmpty(userDos)) {
            return true;
        } else {
            return false;
        }

    }
}
