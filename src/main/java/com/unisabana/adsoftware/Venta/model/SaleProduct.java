package com.unisabana.adsoftware.Venta.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "SALE_PRODUCT")
public class SaleProduct {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id@Setter
    @Getter
    @Column(name = "ID")
    private int id;
    @Setter
    @Getter
    @Column(name = "QUANTITY")
    private int quantity;


}
