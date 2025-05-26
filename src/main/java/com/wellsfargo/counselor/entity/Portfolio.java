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

    @OneToMany
    @JoinColumn(name="clientId", nullable = false)
    private Client client;

    public Portfolio() {
    }

    public Portfolio(int portfolioId, Date creationDate, Client client) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

