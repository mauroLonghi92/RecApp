package com.example.recicladotandil.Entidades;

public class Adress {
    private String department;
    private String number;
    private String streetAdress;
    private String city;
    private String state;
    private String zipCode;

    public Adress() {
    }

    public Adress(String department, String number, String streetAdress, String city, String state, String zipCode) {
        this.department = department;
        this.number = number;
        this.streetAdress = streetAdress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
