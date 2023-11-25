package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int nextId = 1;
    private int id;
    private String name;
    private String surname;
    private Address address;
    private List<Order> orders; // Almacena los pedidos del cliente

    public Customer(String name, String surname, Address address) {
        this.id = nextId++;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Métodos para manejar los pedidos
    public void addOrder(Order order) {
        if (order != null) {
            this.orders.add(order);
        }
    }

    public List<Order> getOrders() {
        return new ArrayList<>(this.orders);
    }

    // Método toString() para representar la información del cliente como una cadena de texto
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address=" + address +
                ", orders=" + orders +
                '}';
    }
}
