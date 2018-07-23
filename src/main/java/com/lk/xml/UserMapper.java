package com.lk.xml;

public interface UserMapper {
    public User getUser(int id);

    public int insertUser(User user);

    public int deleteUser(int id);
}