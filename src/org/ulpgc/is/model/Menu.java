package org.ulpgc.is.model;

import java.util.ArrayList;

public class Menu {
    private final String name;
    private final ArrayList<Dish> dishArrayList;
    private final MenuType menuType;

    ///socorro
    public Menu(String name, MenuType menuType) {
        this.name = name;
        dishArrayList = new ArrayList<>();
        this.menuType = menuType;
    }

    public void addDish(Dish dish) {
        dishArrayList.add(dish);
    }

}