package com.trungnam.BanHang.Controller;

import com.trungnam.BanHang.Request.OrderRequest;
import com.trungnam.BanHang.Response.OrderResponse;
import com.trungnam.BanHang.Service.OrderSevice;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Order")
public class OrderController {
    @Autowired
    OrderSevice orderSevice;
    @GetMapping("/get_order")
    public JSONObject getAllBy(){
        return orderSevice.getAllBy();
    }

    @PostMapping("/add_order")
    public JSONObject addOrder(@RequestBody OrderRequest orderRequest){
        JSONObject js = new JSONObject();
        js.put("Order" , orderSevice.createOrder(orderRequest));
        return js;
    }

    @PostMapping("/add_order1")
    public JSONObject addOrder1(@RequestBody OrderRequest orderRequest){
        JSONObject js = new JSONObject();
        js.put("Order" , orderSevice.createOrder1(orderRequest));
        return js;
    }


}
