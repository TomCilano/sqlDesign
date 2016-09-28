package com.ironyard.data;

/**
 * Created by Tom on 9/28/16.
 */
public class Product {

    private String name;
    private int number;
    private String discription;
    private int price;
    private String category;
    private int id;
    private int comID;

    public Product(String name, int number, String discription, int price, String category, int id, int comID) {
        this.name = name;
        this.number = number;
        this.discription = discription;
        this.price = price;
        this.category = category;
        this.id = id;
        this.comID = comID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getComID() {
        return comID;
    }

    public void setComID(int comID) {
        this.comID = comID;
    }
}
