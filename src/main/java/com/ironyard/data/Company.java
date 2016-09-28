package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 9/28/16.
 */
public class Company {
    private String name;
    private int dun;
    private int id;
    private List<Addresses> addressesList;
    private List<Employees> employeesList;
    private List<Product> productList;
    private List<Order> orderList;

    public Company(String name, int dun, int id, List<Addresses> addressesList, List<Employees> employeesList,
                   List<Product> productList, List<Order> orderList) {
        this.name = name;
        this.dun = dun;
        this.id = id;
        this.addressesList = addressesList;
        this.employeesList = employeesList;
        this.productList = productList;
        this.orderList = orderList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDun() {
        return dun;
    }

    public void setDun(int dun) {
        this.dun = dun;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Addresses> getAddressesList() {
        return addressesList;
    }

    public void setAddressesList(List<Addresses> addressesList) {
        this.addressesList = addressesList;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
