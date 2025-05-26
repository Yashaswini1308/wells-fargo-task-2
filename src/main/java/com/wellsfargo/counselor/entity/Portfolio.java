package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    private int portfolioId;

    @Column(nullable = false)
    private Date creationDate;


    public Portfolio() {
    }

    public Portfolio(int portfolioId, Date creationDate, Client client) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
    }

    public int getPortfolioId() {
        return portfolioId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

