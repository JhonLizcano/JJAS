package com.nisum.hackaton.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private String sku;
    private String name;
    private String price;
    private int quantity;
    private int discount;
    private String[] images;
    private String description;
    private String category;
    private String subcategory;
    private String[] aditionalInformation;
    private String augmentedReality;
    private String favorite;
    private String section;
}
