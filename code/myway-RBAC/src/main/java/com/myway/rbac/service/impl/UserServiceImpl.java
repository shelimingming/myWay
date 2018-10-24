package com.myway.rbac.service.impl;

import com.myway.rbac.dao.UserDOMapper;
import com.myway.rbac.domain.AuthDO;
import com.myway.rbac.domain.RoleDO;
import com.myway.rbac.domain.UserDO;
import com.myway.rbac.domain.UserDOExample;
import com.myway.rbac.service.AuthService;
import com.myway.rbac.service.RoleService;
import com.myway.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDOMapper userDOMapper;

    @Autowired
    AuthService authService;

    @Autowired
    RoleService roleService;

    @Override
    public UserDO get(Integer id) {
        UserDOExample example = new UserDOExample();
        example.createCriteria().andIdEqualTo(id);
        List<UserDO> userDOList = userDOMapper.selectByExample(example);

        if(CollectionUtils.isEmpty(userDOList)) {
            return null;
        }else{
            UserDO userDO = userDOList.get(0);

            List<RoleDO> roleDOList = roleService.getByUserId(userDO.getId());
            userDO.setRoleList(roleDOList);


            List<AuthDO> authDOList = authService.getByUserId(userDO.getId());
            userDO.setAuthDOList(authDOList);

            return userDO;
        }
    }

    @Override
    public List<UserDO> list(Map<String, Object> map) {
        return null;
    }

    @Override
    public int count(Map<String, Object> map) {
        return 0;
    }

}
