package com.unisabana.adsoftware.Venta.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Sale {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "DOCUMENT_CLIENT")
    private int documentClient;
    @Basic
    @Column(name = "TOTAL_AMOUNT")
    private int totalAmount;
    @Basic
    @Column(name = "DATE_CREATED")
    private Date dateCreated;
    @OneToMany(mappedBy = "saleBySaleId")
    private Collection<SaleProduct> saleProductsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumentClient() {
        return documentClient;
    }

    public void setDocumentClient(int documentClient) {
        this.documentClient = documentClient;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return id == sale.id && documentClient == sale.documentClient && totalAmount == sale.totalAmount && Objects.equals(dateCreated, sale.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, documentClient, totalAmount, dateCreated);
    }

    public Collection<SaleProduct> getSaleProductsById() {
        return saleProductsById;
    }

    public void setSaleProductsById(Collection<SaleProduct> saleProductsById) {
        this.saleProductsById = saleProductsById;
    }
}
