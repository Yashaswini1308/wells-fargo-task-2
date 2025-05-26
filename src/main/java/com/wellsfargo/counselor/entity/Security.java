package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private int securityId;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchasedDate;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double purchasedPrice;

    public Security() {
    }

    public Security(int securityId, String securityName, String category, Date purchasedDate, int quantity, double purchasedPrice) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.category = category;
        this.purchasedDate = purchasedDate;
        this.quantity = quantity;
        this.purchasedPrice = purchasedPrice;
    }

    public int getSecurityId() {
        return securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Date purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPurchasedPrice() {
        return purchasedPrice;
    }

    public void setPurchasedPrice(double purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }



}
