package com.myway.demo.mybatis.dao;

import com.myway.demo.mybatis.domain.Department;

public interface DepartmentDao {
    public Department getDepartmentById(Long id);

    public Department getDepartmentHasUserById(Long id);

    public Department getDepartmentHasUserByIdByStep(Long id);
}
