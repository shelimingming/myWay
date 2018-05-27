package com.myway.demo.mybatis.dao;

import com.myway.demo.mybatis.domain.User;

import java.util.List;

public interface UserDao {
    public User getUserById(Long id);

    /**
     * 查询出带有部门信息的User
     * @param id
     * @return
     */
    public User getUserAndDepById(Long id);

    /**
     * 分步查询出带有部门信息的User
     * @param id
     * @return
     */
    public User getUserAndDepByIdByStep(Long id);

    /**
     * 查询出带有RoleList的User
     *
     * @param id
     * @return
     */
    public User getUserAndRoleById(Long id);

    /**
     * 根据部门id查出所有的员工
     * @param id
     * @return
     */
    public List<User> getUserByDepartmentId(Long id);

    public int insertUser(User user);

    public List<User> getUserList();

    public int updateUser(User user);

    public int deleteUser(Long id);
}
