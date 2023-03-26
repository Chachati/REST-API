package com.unisabana.adsoftware.Venta.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "STOCK")
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    @Setter
    @Getter
    private int id;
    @Basic
    @Column(name = "NAME")
    @Setter@Getter
    private String name;
    @Basic
    @Column(name = "VALUE")
    @Setter@Getter
    private int value;
    @Basic
    @Column(name = "QUANTITY")
    @Setter@Getter
    private int quantity;
    @Basic
    @Column(name = "DATE_CREATED")
    @Setter@Getter
    private Date dateCreated;
}
