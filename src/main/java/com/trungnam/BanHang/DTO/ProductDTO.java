package com.trungnam.BanHang.DTO;

import com.trungnam.BanHang.Entity.ProductEntity;

import javax.persistence.Column;
import java.util.Date;

public class ProductDTO {
    private long id;
    private Date creat_date;
    private Date update_time;
    private String productName;
    private double price;
    private long point;
    private  String descrition;
    private long cate_id;

    public ProductDTO (){

    }

    public ProductDTO(ProductEntity productEntity) {
        this.id = productEntity.getId();
        this.creat_date = productEntity.getCreat_date();
        this.update_time = productEntity.getUpdate_time();
        this.productName = productEntity.getProductName();
        this.price = productEntity.getPrice();
        this.point = productEntity.getPoint();
        this.descrition = productEntity.getDescrition();
        this.cate_id = productEntity.getCate_id();
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public long getCate_id() {
        return cate_id;
    }

    public void setCate_id(long cate_id) {
        this.cate_id = cate_id;
    }
}
