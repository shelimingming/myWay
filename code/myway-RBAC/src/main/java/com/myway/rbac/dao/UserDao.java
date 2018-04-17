package com.myway.rbac.dao;

import com.myway.rbac.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    UserDO get(Long userId);
}
