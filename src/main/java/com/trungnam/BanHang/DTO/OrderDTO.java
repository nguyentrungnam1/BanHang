package com.trungnam.BanHang.DTO;

import com.trungnam.BanHang.Entity.OrderEntity;

import javax.persistence.Column;
import java.util.Date;

public class OrderDTO {
    private long id;
    private Date creat_date;
    private Date update_time;
    private long product_id;
    private double totalMoney;
    private long quantity;
    private long userId;
    public OrderDTO(){

    }

    public OrderDTO(OrderEntity orderEntity) {
        this.id = orderEntity.getId();
        this.creat_date = orderEntity.getCreat_date();
        this.update_time = orderEntity.getUpdate_time();
        this.product_id = orderEntity.getProduct_id();
        this.totalMoney = orderEntity.getTotalMoney();
        this.quantity = orderEntity.getQuantity();
        this.userId = orderEntity.getUserId();
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

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
