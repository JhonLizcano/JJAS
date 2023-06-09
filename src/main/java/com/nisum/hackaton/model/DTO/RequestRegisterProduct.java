package com.nisum.hackaton.model.DTO;

import com.nisum.hackaton.util.Constants;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@Builder
public class RequestRegisterProduct {

    @NotBlank(message = Constants.BLANK_SKU)
    private String sku;

    @NotBlank(message = Constants.BLANK_PRODUCT_NAME)
    private String name;

    @NotBlank(message = Constants.BLANK_PRICE)
    private String price;

    private int quantity;

    private int discount;

    private String[] images;

    private String description;

    @NotBlank(message = Constants.BLANK_PRODUCT_CATEGORY)
    private String category;

    @NotBlank(message = Constants.BLANK_SUBCATEGORY)
    private String subcategory;

    private String[] aditionalInformation;

    private String augmentedReality;

    private String favorite;

    @NotBlank(message = Constants.BLANK_SECTION)
    private String section;

    private String idCommerce;
}
