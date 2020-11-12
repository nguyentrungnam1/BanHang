package com.trungnam.BanHang.DTO;

import com.trungnam.BanHang.Entity.OrderDetailEntity;

import java.util.Date;

public class OrderDetailDTO {
    private long id;
    private Date creat_date;
    private Date update_time;
    private long orderId;
    private long productId;
    private long quantity;
    private double intoMoney;

    public OrderDetailDTO(){

    }

    public OrderDetailDTO(OrderDetailEntity orderDetailEntity) {
        this.id = orderDetailEntity.getId();
        this.creat_date = orderDetailEntity.getCreat_date();
        this.update_time = orderDetailEntity.getUpdate_time();
        this.orderId = orderDetailEntity.getOrderId();
        this.productId = orderDetailEntity.getProductId();
        this.quantity = orderDetailEntity.getQuantity();
        this.intoMoney = orderDetailEntity.getIntoMoney();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreat_date() {
        return creat_date;
    }

    public void setCreat_date(Date creat_date) {
        this.creat_date = creat_date;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public double getIntoMoney() {
        return intoMoney;
    }

    public void setIntoMoney(double intoMoney) {
        this.intoMoney = intoMoney;
    }
}
