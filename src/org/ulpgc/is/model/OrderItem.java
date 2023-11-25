package org.ulpgc.is.model;

public class OrderItem {
    private Dish dish; // El plato asociado con este elemento del pedido
    private int quantity; // La cantidad de este plato en el pedido

    // Constructor
    public OrderItem(Dish dish, int quantity) {
        this.dish = dish;
        this.quantity = quantity;
    }

    // Getters y setters para 'dish' y 'quantity'
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Método toString para representar el elemento del pedido como una cadena de texto
    @Override
    public String toString() {
        return dish.getName() + " x " + quantity + " = " + (dish.getPrice() * quantity);
    }
}
