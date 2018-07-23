package com.lk;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select(value = "select * from user_inf where id=#{id}")
    public User getUser(int id);
}