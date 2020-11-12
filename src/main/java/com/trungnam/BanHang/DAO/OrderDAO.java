package com.trungnam.BanHang.DAO;

import com.trungnam.BanHang.DTO.OrderDTO;
import com.trungnam.BanHang.Entity.OrderEntity;
import com.trungnam.BanHang.Repository.OrderRepository;
import com.trungnam.BanHang.Response.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderDAO {
    @Autowired
    OrderRepository orderRepository;
    public List<OrderDTO> getAllByOrder(){
        try {
            List<OrderEntity> listOrderEntity = orderRepository.getAllByOrder();
            List<OrderDTO> listOrderDTO = new ArrayList<>();
            for(OrderEntity enti : listOrderEntity){
                OrderDTO orderDTO = new OrderDTO(enti);
                listOrderDTO.add(orderDTO);
            }
            return listOrderDTO;
        }catch (Exception e){

        }
        return null;
    }
}
