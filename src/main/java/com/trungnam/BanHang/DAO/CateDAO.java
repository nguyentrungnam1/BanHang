package com.trungnam.BanHang.DAO;

import com.trungnam.BanHang.DTO.CateDTO;
import com.trungnam.BanHang.DTO.UserDTO;
import com.trungnam.BanHang.Entity.CategoryEntity;
import com.trungnam.BanHang.Entity.UserEntity;
import com.trungnam.BanHang.Repository.CateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CateDAO{
    @Autowired
    CateRepository cateRepository;
    public CateDTO getIdUser(long id){
        try {
            CategoryEntity categoryEntity = cateRepository.getIdUser(id);
            CateDTO cateDTO = new CateDTO();
            cateDTO.setId(cateDTO.getId());
            cateDTO.setCateName(categoryEntity.getCateName());
            cateDTO.setCreat_date(categoryEntity.getCreat_date());
            cateDTO.setUpdate_time(categoryEntity.getUpdate_time());
            return cateDTO;

        }catch (Exception e){

        }
        return null;
    }

}
