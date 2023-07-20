package com.Endava.EventTix.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer customerID;
    String customerName;
    String email;

    public Customer(Integer customerID, String customerName, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
    }

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    public Customer() {

    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
