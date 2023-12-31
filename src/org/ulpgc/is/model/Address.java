package org.ulpgc.is.model;

public class Address {
    private String street;
    private int number;
    private int postalCode;
    private String city;

    // Constructor
    public Address(String street, int number, int postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    // Setters
    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }
}
