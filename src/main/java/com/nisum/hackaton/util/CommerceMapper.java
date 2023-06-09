package com.nisum.hackaton.util;

import com.nisum.hackaton.model.Commerce;
import com.nisum.hackaton.model.DTO.CommerceDTO;
import com.nisum.hackaton.model.DTO.RequestRegisterCommerce;
import com.nisum.hackaton.model.User;

import java.util.Date;
import java.util.UUID;

public class CommerceMapper {

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
}
