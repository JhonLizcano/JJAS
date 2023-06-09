package com.nisum.hackaton.exceptions;

import com.nisum.hackaton.model.DTO.ResponseRegisterCommerce;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseRegisterCommerce> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex) {
        return new ResponseEntity<ResponseRegisterCommerce>(ResponseRegisterCommerce.builder()
                .mensaje(ex.getAllErrors().get(0).getDefaultMessage())
                .build(), HttpStatus.BAD_REQUEST);
    }
}
