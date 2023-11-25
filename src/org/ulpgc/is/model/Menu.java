package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Dish> dishes; // Lista para manejar múltiples platos
    private MenuType type; // Tipo de menú, utilizando la enumeración MenuType

    // Constructor
    public Menu(String name, MenuType type) {
        this.name = name;
        this.type = type;
        this.dishes = new ArrayList<>();
    }

    // Getters y setters para 'name' y 'type'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    // Métodos para manejar la lista de platos
    public void addDish(Dish dish) {
        if (dish != null && !this.dishes.contains(dish)) {
            this.dishes.add(dish);
        }
    }

    public void removeDish(Dish dish) {
        this.dishes.remove(dish);
    }

    public List<Dish> getDishes() {
        return new ArrayList<>(this.dishes); // Devuelve una copia de la lista para evitar la modificación externa
    }

    // Puedes agregar más lógica y métodos según sea necesario
}
