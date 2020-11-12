package com.trungnam.BanHang.DTO;

import com.trungnam.BanHang.Entity.CategoryEntity;

import javax.persistence.Column;
import java.util.Date;

public class CateDTO {
    private long id;
    private Date creat_date;
    private Date update_time;
    private String cateName;


    public CateDTO(){

    }

    public CateDTO(CategoryEntity categoryEntity) {
        this.id = categoryEntity.getId();
        this.creat_date = categoryEntity.getCreat_date();
        this.update_time = categoryEntity.getUpdate_time();
        this.cateName = categoryEntity.getCateName();
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

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }
}
