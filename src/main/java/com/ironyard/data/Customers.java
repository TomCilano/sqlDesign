package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 9/28/16.
 */
public class Customers {
    private String firstName;
    private String lastName;
    private String email;
    private int id;
    private Addresses address;
    private List<Order> customerOrders;

    public Customers(String firstName, String lastName, String email, int id, Addresses address, List<Order> customerOrders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id = id;
        this.address = address;
        this.customerOrders = customerOrders;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Addresses getAddress() {
        return address;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }

    public List<Order> getCustomerOrders() {
        return customerOrders;
    }

    public void setCustomerOrders(List<Order> customerOrders) {
        this.customerOrders = customerOrders;
    }
}