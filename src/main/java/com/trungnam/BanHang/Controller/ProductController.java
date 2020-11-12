package com.trungnam.BanHang.Controller;

import com.trungnam.BanHang.ServiceImp.ProductServiceImp;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping(path = "/product")
public class ProductController {
    @Autowired
   //ProductService productService;
    ProductServiceImp productServiceImp;
    @GetMapping("/getproduct")
    public JSONObject getProduct(){
        return productServiceImp.findAllById();
    }
}
