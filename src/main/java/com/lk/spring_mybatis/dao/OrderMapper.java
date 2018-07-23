package com.lk.spring_mybatis.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper {
    public Order getOrder(int id);

    public int insertOrder(Order order);

    public int deleteOrder(int id);
}