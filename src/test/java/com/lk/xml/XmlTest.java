package com.lk.xml;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by liukai-pc on 2018/7/20.
 */
public class XmlTest {

    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(1);
            System.out.println(user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

    @Test
    public void insertUserTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user=new User();
            user.setUsername("张三");
            user.setPassword("123456");
            user.setAddress("深圳市");
            int id= userMapper.insertUser(user);

            System.out.println(id+":"+user);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }

    }

}



