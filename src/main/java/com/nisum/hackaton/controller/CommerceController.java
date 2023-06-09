package com.nisum.hackaton.controller;

import com.nisum.hackaton.model.DTO.RequestRegisterCommerce;
import com.nisum.hackaton.model.DTO.ResponseRegisterCommerce;
import com.nisum.hackaton.service.CommerceService;
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
@RequestMapping("/commerce")
public class CommerceController {

    @Autowired
    private CommerceService commerceService;

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseRegisterCommerce> createCommerce(
            @Valid @RequestBody RequestRegisterCommerce requestRegisterCommerce) {
        ResponseRegisterCommerce responseRegisterCommerce = commerceService.saveCommerce(requestRegisterCommerce);
        HttpStatus status =
                responseRegisterCommerce.getCommerce() != null ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
        return new ResponseEntity<>(responseRegisterCommerce, status);
    }
}