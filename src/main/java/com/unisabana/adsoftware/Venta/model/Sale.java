package com.unisabana.adsoftware.Venta.model;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "SALE")
public class Sale {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID") @Getter @Setter
    private int id;
    @Column(name = "DOCUMENT_CLIENT") @Getter @Setter
    private int documentClient;

    @Column(name = "TOTAL_AMOUNT") @Getter @Setter
    private int totalAmount;

    @Column(name = "DATE_CREATED") @Getter @Setter
    private Date dateCreated;
    @OneToMany
    private List <SaleProduct> saleProducts;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return id == sale.id && documentClient == sale.documentClient && totalAmount == sale.totalAmount && Objects.equals(dateCreated, sale.dateCreated);
    }
    @Override
    public String toString() {
        return documentClient + " " + totalAmount + " " + dateCreated;
     }

}
