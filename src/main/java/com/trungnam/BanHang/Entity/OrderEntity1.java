package com.trungnam.BanHang.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_order")
public class OrderEntity1 extends BaseEntity{
    @Column(name = "user_id")
    private long userId;
    @Column(name = "total_money")
    private double totalMoney;
    @Column(name = "sale_money")
    private double saleMoney;

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
