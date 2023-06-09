package com.nisum.hackaton.service.impl;

import com.nisum.hackaton.model.Commerce;
import com.nisum.hackaton.model.DTO.RequestRegisterProduct;
import com.nisum.hackaton.model.DTO.ResponseRegisterProduct;
import com.nisum.hackaton.model.Product;
import com.nisum.hackaton.repository.CommerceRepository;
import com.nisum.hackaton.repository.ProductRepository;
import com.nisum.hackaton.service.ProductService;
import com.nisum.hackaton.util.Constants;
import com.nisum.hackaton.util.UtilMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CommerceRepository commerceRepository;

    @Override
    public ResponseRegisterProduct saveProduct(RequestRegisterProduct requestRegisterProduct) {
        Optional<Product> productValidate = productRepository.findBySku(requestRegisterProduct.getSku());
        if (!productValidate.isPresent()) {
            try {
                Optional<Commerce> commerce =
                        commerceRepository.findByIdCommerce(requestRegisterProduct.getIdCommerce());
                if (commerce.isPresent()) {
                    Product product = productRepository.save(
                            UtilMapper.getProductFromRequestRegister(requestRegisterProduct, commerce.get()));
                    return ResponseRegisterProduct.builder()
                            .product(UtilMapper.getProductDtoFromProduct(product))
                            .build();
                } else {
                    return ResponseRegisterProduct.builder()
                            .mensaje(Constants.COMMERCE_NOT_EXIST)
                            .build();
                }
            } catch (Exception e) {
                return ResponseRegisterProduct.builder()
                        .mensaje(Constants.SAVE_ERROR)
                        .build();
            }
        } else {
            return ResponseRegisterProduct.builder()
                    .mensaje(Constants.EXIST_PRODUCT)
                    .build();
        }
    }
}
