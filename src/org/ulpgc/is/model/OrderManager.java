package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private final List<Customer> customerList;
    private final List<Restaurant> restaurantList;
    private final List<Dish> dishList;
    private final List<Order> orderList;

    public OrderManager() {
        customerList = new ArrayList<>();
        restaurantList = new ArrayList<>();
        dishList = new ArrayList<>();
        orderList = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, Address address) {
        Customer customer = new Customer(name, surname, address);
        customerList.add(customer);
    }

    public void addRestaurant(String name, Phone phone, Menu menu) {
        Restaurant restaurant = new Restaurant(name, phone, menu);
        restaurantList.add(restaurant);
    }

    public void addDish(String name, String description, int price) {
        Dish dish = new Dish(name, description, price);
        dishList.add(dish);
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Customer getCustomer(int index) {
        return customerList.get(index);
    }

    public Restaurant getRestaurant(int index) {
        return restaurantList.get(index);
    }

    public Dish getDish(int index) {
        return dishList.get(index);
    }

    public Order getOrder(int index) {
        return orderList.get(index);
    }

    public void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity) {
        Order order = new Order(customer, restaurant);
        for (int i = 0; i < dishesId.size(); i++) {
            int index = dishesId.get(i);
            Dish dish = dishList.get(index);
            order.addItem(quantity.get(i), dish);
        }
        addOrder(order);
    }

    public void removeCustomer(int index) {
        customerList.remove(index);
    }

    public int customersCount() {
        return customerList.size();
    }
}///socorro