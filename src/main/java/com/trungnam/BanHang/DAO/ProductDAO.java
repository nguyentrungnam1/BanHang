package com.trungnam.BanHang.DAO;

import com.trungnam.BanHang.DTO.ProductDTO;
import com.trungnam.BanHang.Entity.ProductEntity;
import com.trungnam.BanHang.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDAO {
    @Autowired
    ProductRepository productRepository;

    public List<ProductDTO>getProduct() {
        try {
            List<ProductEntity>listProductEntities = productRepository.findAllById();
            List<ProductDTO> listProductDTO = new ArrayList<>();
            for (ProductEntity enti : listProductEntities){
                ProductDTO productDTO = new ProductDTO(enti);
                listProductDTO.add(productDTO);
            }
            return listProductDTO;
        }catch (Exception e){

        }
        return new ArrayList<>();

    }



}
