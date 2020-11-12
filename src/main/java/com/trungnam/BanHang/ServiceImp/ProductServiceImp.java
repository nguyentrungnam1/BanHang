package com.trungnam.BanHang.ServiceImp;

import com.trungnam.BanHang.DAO.ProductDAO;
import com.trungnam.BanHang.DTO.ProductDTO;
import com.trungnam.BanHang.Response.ProductResponse;
import com.trungnam.BanHang.Service.ProductService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductDAO productDAO;

    @Override
    public JSONObject findAllById() {
        try{
            List<ProductDTO> listDTO = productDAO.getProduct();
            List<ProductResponse> listProductResponse = new ArrayList<>();
            for(ProductDTO dto : listDTO){
                ProductResponse productResponse = new ProductResponse(dto);
                listProductResponse.add(productResponse);
            }
            JSONObject js = new JSONObject();
            js.put("product",listProductResponse);
            return js;
        }catch (Exception e){
        }
        return null;
    }
}
