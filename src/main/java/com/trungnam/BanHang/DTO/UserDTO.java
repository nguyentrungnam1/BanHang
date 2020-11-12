package com.trungnam.BanHang.DTO;

import com.trungnam.BanHang.Entity.UserEntity;

import javax.persistence.Column;
import java.util.Date;

public class UserDTO {

    private long id;
    private Date creat_date;
    private Date update_time;
    private String userName;
    private long phone;
    private String address;
    private long point;
    private long level;
    public UserDTO(){

    }

    public UserDTO(UserEntity userEntity) {
        this.id = userEntity.getId();
        this.creat_date = userEntity.getCreat_date();
        this.update_time = userEntity.getUpdate_time();
        this.userName = userEntity.getUserName();
        this.phone = userEntity.getPhone();
        this.address = userEntity.getAddress();
        this.point = userEntity.getPoint();
        this.level = userEntity.getLevel();
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPoint() {
        return point;
    }

    public void setPoint(long point) {
        this.point = point;
    }
}
