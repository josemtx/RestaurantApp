package org.ulpgc.is.control;

import org.ulpgc.is.model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);
    }

    public static void init(OrderManager orderManager) {
        // i. Create two customers with their addresses.
        Address address1 = orderManager.createAddress("123 Main St", 101, 12345, "Metropolis");
        Address address2 = orderManager.createAddress("456 Elm St", 202, 54321, "Gotham");

        Customer customer1 = orderManager.createAndAddCustomer("John", "Doe", address1);
        Customer customer2 = orderManager.createAndAddCustomer("Jane", "Smith", address2);

        // ii. Create two restaurants with phone validation.
        Phone phone1 = orderManager.createPhone("123456789f");
        Phone phone2 = orderManager.createPhone("1234");

        Restaurant restaurant1 = orderManager.createAndAddRestaurant("Good Food", phone1);
        Restaurant restaurant2 = orderManager.createAndAddRestaurant("Eat Well", phone2);

        if (!restaurant1.getPhone().isValid()) {
            restaurant1.getPhone().setNumber("XXXX");
        }
        if (!restaurant2.getPhone().isValid()) {
            restaurant2.getPhone().setNumber("XXXX");
        }

        // iii. Create three different dishes.
        Dish dish1 = orderManager.createAndAddDish("Pizza", "Delicious cheese pizza",13 );
        Dish dish2 = orderManager.createAndAddDish("Burger", "Beef burger with special sauce", 16);
        Dish dish3 = orderManager.createAndAddDish("Pasta", "Penne pasta in tomato sauce", 11);

        // The rest of the code remains the same...

        orderManager.addDish(dish1);
        orderManager.addDish(dish2);
        orderManager.addDish(dish3);

        // iv. Imprimir por pantalla los datos del primer restaurante.
        System.out.println(restaurant1);

        // v. Imprimir por pantalla los datos del segundo cliente.
        System.out.println(customer2);

        // vi. Imprimir por pantalla los datos del tercer plato.
        System.out.println(dish3);

        // vii. Crear un pedido para el primer cliente al primer restaurante con los dos últimos platos.
        ArrayList<Integer> dishIds = new ArrayList<>(Arrays.asList(dish2.getId(), dish3.getId()));
        ArrayList<Integer> quantities = new ArrayList<>(Arrays.asList(2, 3));
        orderManager.createOrder(customer1.getId(), restaurant1.getId(), dishIds, quantities);

        // viii. Borrar el segundo cliente.
        orderManager.removeCustomer(customer2.getId());

        // ix. Imprimir por pantalla el número de clientes.
        System.out.println("Number of customers: " + orderManager.getNumberOfCustomers());

        // x. Imprimir por pantalla el primer pedido del primer cliente, incluyendo el precio total.
        Order firstOrder = customer1.getOrders().get(0);
        System.out.println(firstOrder);
        System.out.println("Total price of the order: " + firstOrder.price());
    }
}

