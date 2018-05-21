package com.myway.demo.mybatis.dao;

import com.myway.demo.mybatis.domain.User;

import java.util.List;

public interface UserDao {
    public User getUserById(Long id);

    public int insertUser(User user);

    public List<User> getUserList();

    public int updateUser(User user);

    public int deleteUser(Long id);
}
