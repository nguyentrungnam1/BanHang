package com.trungnam.BanHang.Request;

import java.util.List;

public class OrderRequest {
    private long userId;
    private List<ProductRequest> listProductRequests;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<ProductRequest> getListProductRequests() {
        return listProductRequests;
    }

    public void setListProductRequests(List<ProductRequest> listProductRequests) {
        this.listProductRequests = listProductRequests;
    }
}
