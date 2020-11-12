package com.trungnam.BanHang.ServiceImp;

import com.trungnam.BanHang.DAO.OrderDAO;
import com.trungnam.BanHang.DAO.ProductDAO;
import com.trungnam.BanHang.DTO.Order1DTO;
import com.trungnam.BanHang.DTO.OrderDTO;
import com.trungnam.BanHang.DTO.ProductDTO;
import com.trungnam.BanHang.Entity.OrderEntity;
import com.trungnam.BanHang.Entity.OrderEntity1;
import com.trungnam.BanHang.Repository.OrderRepository;
import com.trungnam.BanHang.Repository.ProductRepository;
import com.trungnam.BanHang.Request.OrderRequest;
import com.trungnam.BanHang.Request.ProductRequest;
import com.trungnam.BanHang.Response.OrderResponse;
import com.trungnam.BanHang.Service.OrderSevice;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImp implements OrderSevice {
    @Autowired
    ProductDAO productDAO;
    @Autowired
    OrderDAO orderDAO;
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public JSONObject getAllBy() {
            try {
                List<OrderDTO> listOrderDTO = orderDAO.getAllByOrder();
                List<OrderResponse> listOrderResponse = new ArrayList<>();
                for(OrderDTO dto : listOrderDTO){
                    List<ProductDTO> listProductDTO = productDAO.getProduct();
                    for(ProductDTO dto1 : listProductDTO) {
                        OrderResponse orderResponse = new OrderResponse(dto,dto1 );
                        listOrderResponse.add(orderResponse);
                    }
                }
                JSONObject data = new JSONObject();
                data.put("order",listOrderResponse);
                return data;
            }catch (Exception e){

            }
            return null;
    }

    @Override
    public JSONObject createOrder(OrderRequest orderRequest) {
        try{

            List<ProductRequest> listProductRequest = orderRequest.getListProductRequests();
            for(ProductRequest pro : listProductRequest){

                OrderEntity orderEntity = orderRepository.getAllByProductIAndUserId(pro.getProduct_id() , orderRequest.getUserId());
                if(orderEntity != null){
                    System.out.println("aaaaaaaa");
                    double total1 = productRepository.findPriceById(pro.getProduct_id())*pro.getQuantity();
                    orderEntity.setTotalMoney(total1);
                    orderEntity.setQuantity(pro.getQuantity());
                    Date date1 = new Date();
                    orderEntity.setUpdate_time(date1);
                    orderRepository.save(orderEntity);
                    System.out.println("bbbbbb");
                }
                else{

                    OrderEntity entity = new OrderEntity();
                    entity.setProduct_id(pro.getProduct_id());
                    entity.setQuantity(pro.getQuantity());
                    entity.setUserId(orderRequest.getUserId());
                    Date date = new Date();
                    entity.setCreat_date(date);
                    orderRepository.save(entity);
                }


            }
            JSONObject data = new JSONObject();
            return data;
        }catch (Exception e){
            System.out.println(e);
        }

        return null;
    }//nháp

    @Override
    public JSONObject createOrder1(OrderRequest orderRequest) {
      try {
          List<ProductRequest> listProductRequest = orderRequest.getListProductRequests();
          for(ProductRequest pro : listProductRequest){
             // OrderEntity1 orderEntity1 = new
              Order1DTO order1DTO = new Order1DTO();

              JSONObject data = new JSONObject();
              //data.put("Order",listorder);
              return data;
          }



      }catch (Exception e){

      }
        return null;
    }



}
