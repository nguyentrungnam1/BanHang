package com.trungnam.BanHang.Repository;

import com.trungnam.BanHang.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    @Query(value = "select id from user" , nativeQuery = true)
    List<UserEntity> getIdUser(long id);
}
