package com.trungnam.BanHang.DAO;

import com.trungnam.BanHang.DTO.UserDTO;
import com.trungnam.BanHang.Entity.UserEntity;
import com.trungnam.BanHang.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    @Autowired
    UserRepository userRepository;
    public List<UserDTO> getIdUser(long id){
        try {
            List<UserEntity> listUserEntity =  userRepository.getIdUser(id);
            List<UserDTO> listUserDTO = new ArrayList<>();
            for(UserEntity enti : listUserEntity){
                UserDTO userDTO = new UserDTO(enti);
                listUserDTO.add(userDTO);
            }
            return listUserDTO;
        }catch (Exception e){

        }

        return null;
    }
}
