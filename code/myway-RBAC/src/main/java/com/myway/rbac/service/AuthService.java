package com.myway.rbac.service;

import com.myway.rbac.domain.AuthDO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthService {
    AuthDO getById(Integer id);

    List<AuthDO> getByUserId(Integer userId);

    List<AuthDO> getByRoleId(Integer roleId);
}
