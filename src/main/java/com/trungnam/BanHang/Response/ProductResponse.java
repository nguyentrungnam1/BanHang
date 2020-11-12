package com.trungnam.BanHang.Response;

import com.trungnam.BanHang.DTO.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ProductResponse {
    private long id;
    private Date creat_date;
    private Date update_time;
    private String productName;
    private double price;
    private long point;
    private  String descrition;
    private long cate_id;

    public ProductResponse(){

    }

    public ProductResponse(ProductDTO productDTO) {
        this.id = productDTO.getId();
        this.creat_date = productDTO.getCreat_date();
        this.update_time = productDTO.getUpdate_time();
        this.productName = productDTO.getProductName();
        this.price = productDTO.getPrice();
        this.point = productDTO.getPoint();
        this.descrition = productDTO.getDescrition();
        this.cate_id = productDTO.getCate_id();
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
