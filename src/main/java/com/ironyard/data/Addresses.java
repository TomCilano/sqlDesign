package com.ironyard.data;

/**
 * Created by Tom on 9/28/16.
 */
public class Addresses {
    private String name;
    private String firstLine;
    private String secondLine;
    private int phone;
    private String city;
    private String state;
    private int zip;
    private int id;


    public Addresses(String name, String firstLine, String secondLine, int phone, String city, String state, int zip, int id) {
        this.name = name;
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.phone = phone;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

