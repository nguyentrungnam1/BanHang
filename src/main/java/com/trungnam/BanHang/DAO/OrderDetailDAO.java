package com.trungnam.BanHang.DAO;

import com.trungnam.BanHang.Repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailDAO {
    @Autowired
    OrderDetailRepository orderDetailRepository;
}
