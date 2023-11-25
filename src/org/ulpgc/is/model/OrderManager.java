package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
    private Map<Integer, Customer> customers = new HashMap<>();
    private Map<Integer, Restaurant> restaurants = new HashMap<>();
    private Map<Integer, Dish> dishes = new HashMap<>();
    private Map<Integer, Order> orders = new HashMap<>();

    // Métodos para manejar clientes
    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    public void removeCustomer(int customerId) {
        Customer customer = customers.get(customerId);
        if (customer != null) {
            customers.remove(customerId);
        }
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }

    // Métodos para manejar restaurantes
    public void addRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getId(), restaurant);
    }

    public Restaurant getRestaurant(int restaurantId) {
        return restaurants.get(restaurantId);
    }

    // Métodos para manejar platos
    public void addDish(Dish dish) {
        dishes.put(dish.getId(), dish);
    }

    public Dish getDish(int dishId) {
        return dishes.get(dishId);
    }

    // Método para crear y registrar un pedido
    public void createOrder(int customerId, int restaurantId, List<Integer> dishIds, List<Integer> quantities) {
        Customer customer = getCustomer(customerId);
        if (customer == null) {
            throw new IllegalArgumentException("Customer with ID " + customerId + " does not exist.");
        }

        Restaurant restaurant = getRestaurant(restaurantId);
        if (restaurant == null) {
            throw new IllegalArgumentException("Restaurant with ID " + restaurantId + " does not exist.");
        }

        Order newOrder = new Order(restaurant.getId());
        for (int i = 0; i < dishIds.size(); i++) {
            Dish dish = getDish(dishIds.get(i));
            if (dish == null) {
                throw new IllegalArgumentException("Dish with ID " + dishIds.get(i) + " does not exist.");
            }
            int quantity = quantities.get(i);
            newOrder.addItem(new OrderItem(dish, quantity));
        }

        customer.addOrder(newOrder); // Asociar el pedido con el cliente
        orders.put(newOrder.getId(), newOrder); // Registrar el pedido en el sistema
    }

    // Método para obtener un pedido
    public Order getOrder(int orderId) {
        return orders.get(orderId);
    }

    // Método para obtener todos los pedidos de un cliente
    public List<Order> getOrdersByCustomer(int customerId) {
        List<Order> customerOrders = new ArrayList<>();
        for (Order order : orders.values()) {
            if (order.getCustomerId() == customerId) {
                customerOrders.add(order);
            }
        }
        return customerOrders;
    }
}
