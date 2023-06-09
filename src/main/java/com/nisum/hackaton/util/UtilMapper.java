package com.nisum.hackaton.util;

import com.nisum.hackaton.model.Commerce;
import com.nisum.hackaton.model.DTO.CommerceDTO;
import com.nisum.hackaton.model.DTO.ProductDTO;
import com.nisum.hackaton.model.DTO.RequestRegisterCommerce;
import com.nisum.hackaton.model.DTO.RequestRegisterProduct;
import com.nisum.hackaton.model.Product;
import com.nisum.hackaton.model.User;

import java.util.Date;
import java.util.UUID;

public class UtilMapper {

    public static Commerce getCommerceFromRequestRegister(RequestRegisterCommerce requestRegisterCommerce, User user) {
        Commerce commerce = Commerce.builder()
                .idCommerce(UUID.randomUUID().toString())
                .name(requestRegisterCommerce.getName())
                .category(requestRegisterCommerce.getCategory())
                .purpose(requestRegisterCommerce.getPurpose())
                .publicExpected(requestRegisterCommerce.getPublicExpected())
                .city(requestRegisterCommerce.getCity())
                .country(requestRegisterCommerce.getCountry())
                .design(requestRegisterCommerce.getDesign())
                .isActive(Boolean.TRUE)
                .created(new Date())
                .user(user)
                .build();
        return commerce;
    }

    public static CommerceDTO getCommerceDtoFromCommerce(Commerce commerce) {
        return CommerceDTO.builder()
                .idCommerce(commerce.getIdCommerce())
                .name(commerce.getName())
                .category(commerce.getCategory())
                .design(commerce.getDesign())
                .build();
    }

    public static Product getProductFromRequestRegister(
            RequestRegisterProduct requestRegisterProduct, Commerce commerce) {
        Product product = Product.builder()
                .sku(requestRegisterProduct.getSku())
                .name(requestRegisterProduct.getName())
                .price(requestRegisterProduct.getPrice())
                .quantity(requestRegisterProduct.getQuantity())
                .discount(requestRegisterProduct.getDiscount())
                .images(requestRegisterProduct.getImages())
                .description(requestRegisterProduct.getDescription())
                .category(requestRegisterProduct.getCategory())
                .subcategory(requestRegisterProduct.getSubcategory())
                .aditionalInformation(requestRegisterProduct.getAditionalInformation())
                .augmentedReality(requestRegisterProduct.getAugmentedReality())
                .favorite(requestRegisterProduct.getFavorite())
                .section(requestRegisterProduct.getSection())
                .commerce(commerce)
                .build();
        return product;
    }

    public static ProductDTO getProductDtoFromProduct(Product product) {
        return ProductDTO.builder()
                .sku(product.getSku())
                .name(product.getName())
                .price(product.getPrice())
                .quantity(product.getQuantity())
                .discount(product.getDiscount())
                .images(product.getImages())
                .description(product.getDescription())
                .category(product.getCategory())
                .subcategory(product.getSubcategory())
                .aditionalInformation(product.getAditionalInformation())
                .augmentedReality(product.getAugmentedReality())
                .favorite(product.getFavorite())
                .section(product.getSection())
                .build();
    }
}
