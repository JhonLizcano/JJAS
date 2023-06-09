package com.nisum.hackaton.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommerceDTO {

    private String idCommerce;
    private String name;
    private String category;
    private String design;
}
