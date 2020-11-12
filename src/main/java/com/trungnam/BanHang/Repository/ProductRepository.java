package com.trungnam.BanHang.Repository;

import com.trungnam.BanHang.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long > {
    @Query(value = "select * from product " , nativeQuery = true)
    List<ProductEntity> findAllById();

    @Query(value = "select price from product where id = ?1" , nativeQuery = true)
    Double findPriceById(long id);
}
