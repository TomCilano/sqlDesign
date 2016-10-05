package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 9/28/16.
 */
public class Order {
    private int number;
    private int cost;
    private String orderDate;
    private String deliveryDate;
    private int id;
    private List<Product> productList;
    private List<Customers> customersList;
    private Addresses address;

    public Order(int number, int cost, String orderDate, String deliveryDate, int id, List<Product> productList, List<Customers> customersList, Addresses address) {
        this.number = number;
        this.cost = cost;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.id = id;
        this.productList = productList;
        this.customersList = customersList;
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customers> customersList) {
        this.customersList = customersList;
    }

    public Addresses getAddress() {
        return address;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }
}



