package com.myway.rbac.dao;

import com.myway.rbac.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    UserDO get(Long userId);

    List<UserDO> list(Map<String,Object> map);

    int count(Map<String,Object> map);

    int save(UserDO user);

    int update(UserDO user);

    int remove(Long userId);

    int batchRemove(Long[] userIds);
}
