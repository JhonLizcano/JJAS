package com.nisum.hackaton.controller;

import com.nisum.hackaton.model.DTO.RequestRegisterProduct;
import com.nisum.hackaton.model.DTO.ResponseRegisterProduct;
import com.nisum.hackaton.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseRegisterProduct> createProduct(
            @Valid @RequestBody RequestRegisterProduct requestRegisterProduct) {
        ResponseRegisterProduct responseRegisterProduct = productService.saveProduct(requestRegisterProduct);
        HttpStatus status =
                responseRegisterProduct.getProduct() != null ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(responseRegisterProduct, status);
    }
}
