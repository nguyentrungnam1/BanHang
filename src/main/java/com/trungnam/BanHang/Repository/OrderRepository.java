package com.trungnam.BanHang.Repository;

import com.trungnam.BanHang.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    @Query(value = "select * from order1" , nativeQuery = true)
    List<OrderEntity> getAllByOrder();

    @Query(value = "select * from order1 where product_id = ?1 and user_id = ?2 LIMIT 1", nativeQuery = true)
    OrderEntity getAllByProductIAndUserId(long productId , long userId);

}
