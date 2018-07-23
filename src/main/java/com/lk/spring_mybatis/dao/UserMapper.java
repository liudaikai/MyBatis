package com.lk.spring_mybatis.dao;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public User getUser(int id);
    public List<User> getUsers(String name);
    public int insertUser(User user);

    public int deleteUser(int id);
}