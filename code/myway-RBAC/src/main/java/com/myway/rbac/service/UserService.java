package com.myway.rbac.service;

import com.myway.rbac.domain.UserDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface UserService {
    UserDO get(Integer id);

    List<UserDO> list(Map<String, Object> map);

    int count(Map<String, Object> map);
}
