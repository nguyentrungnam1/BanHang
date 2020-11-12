package com.trungnam.BanHang.DTO;

import com.trungnam.BanHang.Entity.OrderEntity1;

import javax.persistence.Column;
import java.util.Date;

public class Order1DTO {
    private long id;
    private Date creat_date;
    private Date update_time;
    private long userId;
    private double totalMoney;
    private double saleMoney;


    public Order1DTO(){

    }

    public Order1DTO(OrderEntity1 orderEntity1) {
        this.id = orderEntity1.getId();
        this.creat_date = orderEntity1.getCreat_date();
        this.update_time = orderEntity1.getUpdate_time();
        this.userId = orderEntity1.getUserId();
        this.totalMoney = orderEntity1.getTotalMoney();
        this.saleMoney = orderEntity1.getSaleMoney();
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(double saleMoney) {
        this.saleMoney = saleMoney;
    }
}
