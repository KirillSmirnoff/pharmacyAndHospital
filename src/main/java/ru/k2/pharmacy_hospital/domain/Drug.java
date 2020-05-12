package ru.k2.pharmacy_hospital.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "drug")
public class Drug implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "drug_name")
    String drugName;
    @Column(name = "product_type")
    String productType;
    @Column(name = "active_ingreds")
    String activeIngrds;
    @Column(name = "manufacturer")
    String manufacturer;
    @Column(name = "country_origin")
    String countyOrigin;
    @Column(name = "pharma_group")
    String pharmaGroup;
    @Column(name = "form_and_pack")
    String formAndPack;
//    boolean status;
}


