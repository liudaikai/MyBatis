package com.lk.spring_mybatis.service;

import com.lk.spring_mybatis.dao.User;
import com.lk.spring_mybatis.dao.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;


/**
 * @author gacl
 * 使用@Service注解将UserServiceImpl类标注为一个service
 * service的id是userService
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    /**
     * 使用@Autowired注解标注userMapper变量，
     * 当需要使用UserMapper时，Spring就会自动注入UserMapper
     */
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession = null;

    /**
     * 获取sqlSession.
     * @return
     */
    public SqlSession getSqlSession(){
        if(sqlSession==null){
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }


    @Autowired
    private UserMapper userMapper;//注入dao



    @Override
    public User getUser(int id) {

        getSqlSession();
        try {
            System.out.println("=====================getUser========================");
            System.out.println("AutoCommit:"+sqlSession.getConnection().getAutoCommit());

            System.out.println("getConnection:"+sqlSession.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userMapper.getUser(id);

    }

    public int saveUser(User user) {

        getSqlSession();
        try {
            System.out.println("=====================saveUser========================");
            System.out.println("AutoCommit:"+sqlSession.getConnection().getAutoCommit());

            System.out.println("getConnection:"+sqlSession.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userMapper.insertUser(user);

    }

    public int getUser(User user) {
        return userMapper.insertUser(user);

    }

}