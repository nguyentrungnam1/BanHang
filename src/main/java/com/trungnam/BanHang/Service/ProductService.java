package com.trungnam.BanHang.Service;

import net.minidev.json.JSONObject;
import org.springframework.stereotype.Service;


@Service
public interface ProductService {
    public JSONObject findAllById();
}
