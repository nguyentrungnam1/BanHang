package com.trungnam.BanHang.Response;

import com.trungnam.BanHang.DTO.OrderDTO;
import com.trungnam.BanHang.DTO.ProductDTO;

import java.util.Date;

public class OrderResponse {
    private long id;
    private Date creat_date;
    private Date update_time;
    private long cate_id;
    private String descrition;
    private long point;
    private double price;
    private String productName;
    private long userId;
    private double totalMoney;
    private long quantity;

    public OrderResponse(){

    }

    public OrderResponse(OrderDTO orderDTO , ProductDTO productDTO) {
        if(orderDTO != null){
            this.id = orderDTO.getId();
            this.creat_date = orderDTO.getCreat_date();
            this.update_time = orderDTO.getUpdate_time();
            this.totalMoney = orderDTO.getTotalMoney();
            this.quantity = orderDTO.getQuantity();
            this.userId = orderDTO.getUserId();
        }
        if(productDTO != null) {
            this.cate_id = productDTO.getCate_id();
            this.descrition = productDTO.getDescrition();
            this.point = productDTO.getPoint();
            this.price = productDTO.getPrice();
            this.productName = productDTO.getProductName();
        }

    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
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

    public long getCate_id() {
        return cate_id;
    }

    public void setCate_id(long cate_id) {
        this.cate_id = cate_id;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
}
