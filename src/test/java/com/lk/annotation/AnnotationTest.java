package com.lk.annotation;

import static org.junit.Assert.assertTrue;

import com.lk.*;
import com.lk.DBUtils;
import com.lk.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AnnotationTest
{

    @org.junit.Test
    public void test2() {
        SqlSession sqlSession = null;
        try {
            sqlSession = com.lk.DBUtils.openSqlSession();
            com.lk.UserMapper userMapper = sqlSession.getMapper(com.lk.UserMapper.class);
            com.lk.User user = userMapper.getUser(1);
            System.out.println(user.toString());
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

    @org.junit.Test
    public void test3() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            com.lk.User user = (User) sqlSession.selectOne("com.lk.UserMapper.getUser", 1);
            System.out.println(user.toString());
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
