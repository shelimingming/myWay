package com.myway.rbac.service.impl;

import com.myway.rbac.dao.AuthDOMapper;
import com.myway.rbac.dao.RoleAuthDOMapper;
import com.myway.rbac.dao.UserAuthDOMapper;
import com.myway.rbac.domain.*;
import com.myway.rbac.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthDOMapper authDOMapper;

    @Autowired
    private UserAuthDOMapper userAuthDOMapper;

    @Autowired
    private RoleAuthDOMapper roleAuthDOMapper;


    @Override
    public AuthDO getById(Integer id) {
        AuthDOExample example = new AuthDOExample();
        example.createCriteria().andIdEqualTo(id);
        List<AuthDO> authDOList = authDOMapper.selectByExample(example);

        if (CollectionUtils.isEmpty(authDOList)) {
            return null;
        } else {
            return authDOList.get(0);
        }

    }

    @Override
    public List<AuthDO> getByUserId(Integer userId) {
        List<AuthDO> authDOList = new ArrayList<>();

        UserAuthDOExample example = new UserAuthDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserAuthDO> userAuthDOList = userAuthDOMapper.selectByExample(example);

        for (UserAuthDO userAuthDO : userAuthDOList) {
            AuthDO authDO = getById(userAuthDO.getAuthId());
            authDOList.add(authDO);
        }

        return authDOList;
    }

    @Override
    public List<AuthDO> getByRoleId(Integer roleId) {
        List<AuthDO> authDOList = new ArrayList<>();

        RoleAuthDOExample example = new RoleAuthDOExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        List<RoleAuthDO> roleAuthDOList = roleAuthDOMapper.selectByExample(example);

        for (RoleAuthDO roleAuthDO : roleAuthDOList) {
            AuthDO authDO = getById(roleAuthDO.getAuthId());
            authDOList.add(authDO);
        }


        return authDOList;
    }
}
