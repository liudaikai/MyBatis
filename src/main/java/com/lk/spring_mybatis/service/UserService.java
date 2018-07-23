package com.lk.spring_mybatis.service;

import com.lk.spring_mybatis.dao.User;

/**
 * Created by liukai-pc on 2018/7/23.
 */
public interface UserService {


    public User getUser(int id);
    public int saveUser(User user) ;

    public int getUser(User user);

}
