package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Client {
    @Id
    @GeneratedValue
    private int clientId;

    @Column(nullable = false)
    private String clientFirstName;

    @Column(nullable = false)
    private String clientLastName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String clientEmail;

   @OneToMany
    @JoinColumn(name="advisorId", nullable = false)
    private Advisor advisor;

    public Client() {
    }

    public Client(int clientId, String clientFirstName, String clientLastName, String phoneNumber, String address, String clientEmail, Advisor advisor) {
        this.clientId = clientId;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.clientEmail = clientEmail;
        this.advisor = advisor;
    }

    public int getClientId() {
        return clientId;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
