package com.trungnam.BanHang.DAO;

import com.trungnam.BanHang.DTO.Order1DTO;
import com.trungnam.BanHang.DTO.OrderDTO;
import com.trungnam.BanHang.Entity.OrderEntity1;
import com.trungnam.BanHang.Repository.Order1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order1DAO {
    @Autowired
    Order1Repository orderEntity1Repository;

    public Order1DTO findAllById(long id){
        OrderEntity1 orderEntity1 = orderEntity1Repository.findAllById(id);
        Order1DTO order1DTO = new Order1DTO();
        order1DTO.setId(orderEntity1.getId());
        order1DTO.setCreat_date(orderEntity1.getCreat_date());
        order1DTO.setUpdate_time(orderEntity1.getUpdate_time());
        order1DTO.setUserId(orderEntity1.getUserId());
        order1DTO.setSaleMoney(orderEntity1.getSaleMoney());
        order1DTO.setTotalMoney(orderEntity1.getTotalMoney());
        return order1DTO;
    }
}
