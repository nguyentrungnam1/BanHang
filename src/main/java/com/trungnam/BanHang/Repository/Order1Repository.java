package com.trungnam.BanHang.Repository;

import com.trungnam.BanHang.Entity.OrderEntity1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Order1Repository extends JpaRepository<OrderEntity1 , Long> {
    @Query(value = "select * from order_order where user_id " , nativeQuery = true)
    OrderEntity1 findAllById(long id);
}
