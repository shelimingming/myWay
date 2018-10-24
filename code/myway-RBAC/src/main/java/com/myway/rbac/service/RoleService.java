package com.myway.rbac.service;

import com.myway.rbac.domain.AuthDO;
import com.myway.rbac.domain.RoleDO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    RoleDO getById(Integer id);

    List<RoleDO> getByUserId(Integer userId);

    /**
     * 获取该角色下的所有权限
     *
     * @param id
     * @return
     */
    List<AuthDO> getAuthById(Integer id);
}
