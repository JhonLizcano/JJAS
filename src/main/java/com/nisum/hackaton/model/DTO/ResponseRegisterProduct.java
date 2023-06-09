package com.nisum.hackaton.model.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseRegisterProduct {

    private ProductDTO product;
    private String mensaje;
}
