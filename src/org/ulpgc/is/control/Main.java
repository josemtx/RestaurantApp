package org.ulpgc.is.control;

import org.ulpgc.is.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void init(OrderManager manager) {
        //i
        Address address1 = new Address("Triana", 2, 35300, "Las Palmas de Gran Canaria.");
        Address address2 = new Address("La Retama", 1, 35330, "Las Palmas de Gran Canaria.");
        manager.addCustomer("Álvaro", "Rodríguez", address1);
        manager.addCustomer("José", "Mataix", address2);
        //ii
        Phone phone1 = new Phone("+34623456111");
        Phone phone2 = new Phone("003411111111");
        Menu menu1 = new Menu("Carbonara", MenuType.Daily);
        Menu menu2 = new Menu("Bolognesa", MenuType.Kids);
        phone1.setNumber();
        phone2.setNumber();
        manager.addRestaurant("La Gustosa", phone1, menu1);
        manager.addRestaurant("O'Sole Mio", phone2, menu2);
        //iii
        manager.addDish("Tagliatelle a la Carbonara", "Pasta Tagliatelle, Huevo, Queso Pecorino Romano," +
                "Guanciale, Pimienta Negra", 14);
        manager.addDish("Tortellini Bolognesa", "Tortellini, Salsa Bolonegsa(Vacuno Picado, Cebolla, " +
                "Zanahoria, Salsa de tomate, Vino Blanco, Leche, Aceite de oliva, Sal y Pimienta)", 15);
        manager.addDish("Pizza Margarita", "Masa Casera, Salsa de tomate, Queso Mozzarella fresco," +
                "Hojas de Albahaca, Aceite de oliva, Sal y Pimienta", 9);
    }

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);
        //iv
        Restaurant restaurant1 = orderManager.getRestaurant(0);
        System.out.println("El primer restaurante es " + restaurant1.getName() + " y su número de teléfono es " + restaurant1.getPhone() + "\n------");
        //v
        Customer customer2 = orderManager.getCustomer(1);
        System.out.println("El segundo cliente es " + customer2.getName() + " " + customer2.getSurname() + " y su dirección es la calle " + customer2.getAddress().getStreet() + " nº " + customer2.getAddress().getNumber() + " con código postal " + customer2.getAddress().getPostalCode() + " ubicado en " + customer2.getAddress().getCity() + "\n------");
        //vi
        Dish dish3 = orderManager.getDish(2);
        System.out.println("El tercer plato es " + dish3.getName() + " que es " + dish3.getDescription() + ", y su precio total son " + dish3.getPrice() + "€" + "\n------");
        //vii
        ArrayList<Integer> plates = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> quantities = new ArrayList<>(Arrays.asList(2, 2));

        orderManager.order(orderManager.getCustomer(0), orderManager.getRestaurant(0), plates, quantities);
        //viii
        orderManager.removeCustomer(1);
        //ix
        System.out.println("Número de clientes: " + orderManager.customersCount() + "\n------");
        //x
        ArrayList<String> orderItemStringList = orderManager.getOrder(0).getOrderItemArrayList();
        int total = orderManager.getOrder(0).price();
        System.out.println("El pedido del primer cliente es: " + orderItemStringList + ".\n---Coste total: " + total + "€---");
    }
}