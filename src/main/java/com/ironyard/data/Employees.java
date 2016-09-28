package com.ironyard.data;

import java.util.List;

/**
 * Created by Tom on 9/28/16.
 */
public class Employees {
    private String firstName;
    private String lastName;
    private int ssn;
    private int id;
    private int empConID;
    private List<Addresses> addressesList;

    public Employees(String firstName, String lastName, int ssn, int id, int empConID, List<Addresses> addressesList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.id = id;
        this.empConID = empConID;
        this.addressesList = addressesList;
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

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpConID() {
        return empConID;
    }

    public void setEmpConID(int empConID) {
        this.empConID = empConID;
    }

    public List<Addresses> getAddressesList() {
        return addressesList;
    }

    public void setAddressesList(List<Addresses> addressesList) {
        this.addressesList = addressesList;
    }
}
