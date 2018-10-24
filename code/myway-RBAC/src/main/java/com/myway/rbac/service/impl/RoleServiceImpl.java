package com.myway.rbac.service.impl;

import com.myway.rbac.dao.RoleAuthDOMapper;
import com.myway.rbac.dao.RoleDOMapper;
import com.myway.rbac.dao.UserAuthDOMapper;
import com.myway.rbac.dao.UserRoleDOMapper;
import com.myway.rbac.domain.*;
import com.myway.rbac.service.AuthService;
import com.myway.rbac.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDOMapper roleDOMapper;

    @Autowired
    UserRoleDOMapper userRoleDOMapper;

    @Autowired
    AuthService authService;

    @Override
    public RoleDO getById(Integer id) {
        RoleDOExample example = new RoleDOExample();
        example.createCriteria().andIdEqualTo(id);
        List<RoleDO> roleDOList = roleDOMapper.selectByExample(example);

        for (RoleDO roleDO:roleDOList ) {
            List<AuthDO> authDOList = authService.getByRoleId(roleDO.getId());
            roleDO.setAuthDOList(authDOList);
        }

        if (CollectionUtils.isEmpty(roleDOList)) {
            return null;
        } else {
            return roleDOList.get(0);
        }
    }

    @Override
    public List<RoleDO> getByUserId(Integer userId) {
        List<RoleDO> roleDOList = new ArrayList<>();

        UserRoleDOExample example = new UserRoleDOExample();
        example.createCriteria().andUserIdEqualTo(userId);
        List<UserRoleDO> userRoleDOList = userRoleDOMapper.selectByExample(example);

        for (UserRoleDO userRoleDO:userRoleDOList) {
            RoleDO roleDO = getById(userRoleDO.getRoleId());
            roleDOList.add(roleDO);
        }

        return roleDOList;
    }

    @Override
    public List<AuthDO> getAuthById(Integer id) {
        return null;
    }
}
