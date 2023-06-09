package com.nisum.hackaton.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private String price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "discount")
    private int discount;

    @Column(name = "images")
    private String[] images;

    @Column(name = "description")
    private String description;

    @Column(name = "category")
    private String category;

    @Column(name = "subcategory")
    private String subcategory;

    @Column(name = "aditional_information")
    private String[] aditionalInformation;

    @Column(name = "augmented_reality")
    private String augmentedReality;

    @Column(name = "favorite")
    private String favorite;

    @Column(name = "stock_in_cart")
    private String stockCart;

    @Column(name = "section")
    private String section;

    @ManyToOne
    @JoinColumn(name = "id_commerce", nullable=false)
    private Commerce commerce;
}
