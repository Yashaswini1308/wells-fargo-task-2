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

    @OneToMany
    @JoinColumn(name="portfolioId", nullable = false)
    private Portfolio portfolio;


    public Security() {
    }

    public Security(int securityId, String securityName, String category, Date purchasedDate, int quantity, double purchasedPrice, Portfolio portfolio) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.category = category;
        this.purchasedDate = purchasedDate;
        this.quantity = quantity;
        this.purchasedPrice = purchasedPrice;
        this.portfolio = portfolio;
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

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }


}
