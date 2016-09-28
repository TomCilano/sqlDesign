package com.ironyard.data;

/**
 * Created by Tom on 9/28/16.
 */
public class Order {
    private int number;
    private int cost;
    private String orderDate;
    private String deliveryDate;
    private int id;
    private  int ordComID;

    public Order(int number, int cost, String orderDate, String deliveryDate, int id, int ordComID) {
        this.number = number;
        this.cost = cost;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.id = id;
        this.ordComID = ordComID;
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

    public int getOrdComID() {
        return ordComID;
    }

    public void setOrdComID(int ordComID) {
        this.ordComID = ordComID;
    }
}

