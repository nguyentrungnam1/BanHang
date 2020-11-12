package com.trungnam.BanHang.Repository;

import com.trungnam.BanHang.Entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity ,Long> {

}
