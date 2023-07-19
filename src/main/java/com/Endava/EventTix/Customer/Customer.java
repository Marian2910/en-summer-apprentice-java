package com.Endava.EventTix.Customer;

public class Customer {
    int customerID;
    String customerName;
    String email;

    public Customer(int customerID, String customerName, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
    }

    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
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
