package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 0; // Variable estática para generar un ID único para cada pedido

    private final int id; // ID único para el pedido
    private List<OrderItem> items; // Lista de elementos del pedido
    private int tableId; // ID de la mesa que hizo el pedido, si es aplicable

    // Constructor
    public Order(int tableId) {
        this.id = NEXT_ID++; // Asigna el siguiente ID único y lo incrementa para el siguiente pedido
        this.tableId = tableId;
        this.items = new ArrayList<>();
    }

    // Método para obtener el ID del pedido
    public int getId() {
        return id;
    }

    // Método para obtener la ID de la mesa
    public int getTableId() {
        return tableId;
    }

    // Método para establecer la ID de la mesa
    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    // Método para añadir un elemento al pedido
    public void addItem(OrderItem item) {
        if (item != null) {
            this.items.add(item);
        }
    }

    // Método para eliminar un elemento del pedido
    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    // Método para obtener los elementos del pedido
    public List<OrderItem> getItems() {
        return new ArrayList<>(this.items); // Devuelve una copia de la lista para evitar la modificación externa
    }

    // Método para calcular el precio total del pedido
    public int price() {
        int total = 0;
        for (OrderItem item : this.items) {
            total += item.getDish().getPrice() * item.getQuantity();
        }
        return total;
    }

    // Método toString para representar el pedido como una cadena de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order ID: " + id + " Table ID: " + tableId + "\n");
        for (OrderItem item : this.items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total Price: ").append(price());
        return sb.toString();
    }

    public int getCustomerId() {
        return 0;
    }
}
