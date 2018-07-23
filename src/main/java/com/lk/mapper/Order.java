package com.lk.mapper;

/**
 * Created by liukai-pc on 2018/7/23.
 */
public class Order {
    private int id;
    private int userId;
    private String orderDetail;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderDetail='" + orderDetail + '\'' +
                '}';
    }
}
