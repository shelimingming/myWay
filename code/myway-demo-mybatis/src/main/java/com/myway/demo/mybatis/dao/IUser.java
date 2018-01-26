package com.myway.demo.mybatis.dao;

import com.myway.demo.mybatis.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUser {
    //@Select("select * from user where id= #{id}")
    //public User getUserByID(int id);
    public List<User> getUserList();

    public void insertUser(User user);

    public void updateUser(User user);

    public void deleteUser(int userId);

    public User getUser(int id);
}