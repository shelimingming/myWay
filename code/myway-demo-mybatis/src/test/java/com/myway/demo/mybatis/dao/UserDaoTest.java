package com.myway.demo.mybatis.dao;

import com.myway.demo.mybatis.SqlSessionFactoryUtil;
import com.myway.demo.mybatis.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDaoTest {

    File file = null;

//    @Before
//    public void setUp() {
//        IDatabaseConnection connection = null;
//        try {
//            //super.setUp();
//            Class.forName("com.mysql.jdbc.Driver");
//            // 连接DB
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myway?serverTimezone=UTC", "root", "123456");
//            // 获得DB 连接
//            connection = new DatabaseConnection(conn);
//            // 对数据库中的操作对象表student 进行备份
//            QueryDataSet backupDataSet = new QueryDataSet(connection);
//            backupDataSet.addTable("demo_mybatis_user");
//            file = File.createTempFile("demo_mybatis_user", ".xml");// 备份文件
//            FlatXmlDataSet.write(backupDataSet, new FileOutputStream(file));
//            // 准备数据的读入
//            IDataSet dataSet = new FlatXmlDataSet(new FileInputStream("E:\\study\\myway\\myWay\\code\\myway-demo-mybatis\\target\\test-classes\\dao\\UserDaoTest\\getUserByIdTest\\user_pre.xml"));
//            DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException e) {
//            }
//        }
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        IDatabaseConnection connection = null;
//        try {
//            //super.tearDown();
//            // 本例使用postgresql 数据库
//            Class.forName("com.mysql.jdbc.Driver");
//            // 连接DB
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myway?serverTimezone=UTC", "root", "123456");
//            connection = new DatabaseConnection(conn);
//            IDataSet dataSet = new FlatXmlDataSet(file);
//            DatabaseOperation.CLEAN_INSERT.execute(connection, dataSet);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//            }
//        }
//    }

    @Test
    public void getUserByIdTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.getUserById(1L);
        System.out.println(user);
    }

    @Test
    public void getUserAndDepByIdTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User userAndDepById = userDao.getUserAndDepById(1L);
        System.out.println(userAndDepById);
    }

    @Test
    public void getUserAndDepByIdByStepTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User userAndDepById = userDao.getUserAndDepByIdByStep(1L);
        System.out.println(userAndDepById);
    }

    @Test
    public void getUserList() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> userList = userDao.getUserList();
        System.out.println(userList);
    }

    @Test
    public void insertUserTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setName("a");
        user.setCreateTime(new Date());
        int i = userDao.insertUser(user);

        sqlSession.commit();

        System.out.println(i);
    }

    @Test
    public void updateUserTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        User user = new User();
        user.setId(1L);
        user.setName("b");
        user.setCreateTime(new Date());
        int i = userDao.updateUser(user);

        sqlSession.commit();
    }

    @Test
    public void deleteUserTest() {
        SqlSession sqlSession = SqlSessionFactoryUtil.openSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        int i = userDao.deleteUser(3L);
        System.out.println(i);

        sqlSession.commit();
    }
}
