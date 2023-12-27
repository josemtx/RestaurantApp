package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private final String name;
    private final Phone phone;
    private final Menu menu;
    private final List<Menu> menuList = new ArrayList<>();

    public Restaurant(String name, Phone phone, Menu menu) {
        this.name = name;
        this.phone = phone;
        this.menu = menu;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone.getNumber();
    }

}///socorro