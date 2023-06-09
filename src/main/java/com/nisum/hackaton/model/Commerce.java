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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "COMMERCE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Commerce {

    @Id
    @Column(name = "id_commerce")
    private String idCommerce;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "public_expected")
    private String publicExpected;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "design")
    private String design;

    private Date created;

    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable=false)
    private User user;

    @OneToMany(mappedBy = "commerce")
    private Set<Product> products;
}
