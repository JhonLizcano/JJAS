package com.nisum.hackaton.service;

import com.nisum.hackaton.model.DTO.RequestRegisterCommerce;
import com.nisum.hackaton.model.DTO.ResponseRegisterCommerce;

public interface CommerceService {

    ResponseRegisterCommerce saveCommerce(RequestRegisterCommerce requestRegisterCommerce);
}
