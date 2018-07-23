package com.lk.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Created by liukai-pc on 2018/7/20.
 */
public class MapperTest {

    @Test
    public void test1() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            System.out.println("=====================saveUser========================");
            System.out.println("AutoCommit:"+sqlSession.getConnection().getAutoCommit());

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(2);
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
    public void testGetUserByName() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.getUsers("深圳市");
            for(User user:users){
                System.out.println(user);
            }

            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        SqlSessionTemplate sqlSessionTemplate;

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



