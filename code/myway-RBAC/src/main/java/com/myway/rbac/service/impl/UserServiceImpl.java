package com.myway.rbac.service.impl;

import com.myway.rbac.dao.UserDao;
import com.myway.rbac.domain.UserDO;
import com.myway.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userMapper;

    @Override
    public UserDO get(Long id) {
        UserDO user = userMapper.get(id);
        return user;
    }

    @Override
    public List<UserDO> list(Map<String, Object> map) {
        return userMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map) {
        return userMapper.count(map);
    }

}
