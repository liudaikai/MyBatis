package com.lk.mapper;



public interface OrderMapper {
    public Order getOrder(int id);

    public int insertOrder(Order order);

    public int deleteOrder(int id);
}