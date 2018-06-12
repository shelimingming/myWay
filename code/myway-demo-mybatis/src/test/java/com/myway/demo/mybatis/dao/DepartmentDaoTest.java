package com.myway.demo.mybatis.dao;

import com.myway.demo.mybatis.SqlSessionFactoryUtil;
import com.myway.demo.mybatis.domain.Department;
import com.myway.demo.mybatis.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class DepartmentDaoTest {
    @Test
    public void getDepartmentByIdTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
        Department department = departmentDao.getDepartmentById(1L);
        System.out.println(department);
    }

    @Test
    public void getDepartmentHasUserByIdTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
        Department department = departmentDao.getDepartmentHasUserById(1L);
        System.out.println(department.getUserList());
    }

    @Test
    public void getDepartmentHasUserByIdByStepTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        DepartmentDao departmentDao = sqlSession.getMapper(DepartmentDao.class);
        Department department = departmentDao.getDepartmentHasUserByIdByStep(1L);
        System.out.println(department.getUserList());
    }
}
