package com.myway.rbac.service;

import com.myway.rbac.domain.UserDO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDO get(Long id);
}
