package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Dish> dishes;
    private MenuType type;

    // Constructor
    public Menu(String name, MenuType type) {
        this.name = name;
        this.type = type;
        this.dishes = new ArrayList<>();
    }

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

    public void addDish(Dish dish) {
        if (dish != null && !this.dishes.contains(dish)) {
            this.dishes.add(dish);
        }
    }

    public void removeDish(Dish dish) {
        this.dishes.remove(dish);
    }

    public List<Dish> getDishes() {
        return new ArrayList<>(this.dishes);
    }
}