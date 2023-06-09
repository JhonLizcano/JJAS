package com.nisum.hackaton.service;

import com.nisum.hackaton.model.DTO.RequestRegisterProduct;
import com.nisum.hackaton.model.DTO.ResponseRegisterProduct;

public interface ProductService {

    ResponseRegisterProduct saveProduct(RequestRegisterProduct requestRegisterProduct);
}
