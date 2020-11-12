package com.trungnam.BanHang.Repository;

import com.trungnam.BanHang.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CateRepository extends JpaRepository<CategoryEntity,Long > {
    @Query(value = "select id form cate" , nativeQuery = true)
    CategoryEntity getIdUser (long id);
}
