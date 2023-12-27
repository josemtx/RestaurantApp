package org.ulpgc.is.model;

public class OrderItem {
    private final int quantity;
    private final Dish dish;

    public OrderItem(int quantity, Dish dish) {
        this.quantity = quantity;
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDishName() {
        return dish.getName();
    }

    public int getDishPrice() {
        return dish.getPrice();
    }
}