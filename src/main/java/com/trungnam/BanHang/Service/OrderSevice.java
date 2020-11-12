package com.trungnam.BanHang.Service;

import com.trungnam.BanHang.Request.OrderRequest;
import com.trungnam.BanHang.Response.OrderResponse;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;


public interface OrderSevice {
    public JSONObject getAllBy();

    public JSONObject createOrder(OrderRequest orderRequest);

    public JSONObject createOrder1(OrderRequest orderRequest);
}
