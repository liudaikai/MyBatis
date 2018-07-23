package com.lk.mapper;


import java.util.List;

public interface UserMapper {
    public User getUser(int id);
    public List<User> getUsers(String  name);
    public int insertUser(User user);

    public int deleteUser(int id);
}