package com.myway.demo.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    /**
     * 单例模式，私有化构造方法
     */
    private SqlSessionFactoryUtil() {

    }

    /**
     * 初始化SqlSessionFactory
     *
     * @return
     */
    public static SqlSessionFactory initSqlSessionFactory() {
        String resource = "mybatis/Configure.xml";
        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        synchronized (SqlSessionFactory.class) {
            if (sqlSessionFactory == null) {
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            }
        }

        return sqlSessionFactory;
    }

    /**
     * 打开一个SqlSession
     *
     * @return
     */
    public static SqlSession openSqlSession() {
        if (sqlSessionFactory == null) {
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
