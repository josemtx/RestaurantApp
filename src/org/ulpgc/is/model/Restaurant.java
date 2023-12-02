package org.ulpgc.is.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static int nextId = 1;
    private int id;
    private String name;
    private Phone phone;
    private List<Menu> menus;

    public Restaurant(String name, Phone phone) {
        this.id = nextId++;
        this.name = name;
        this.phone = phone;
        this.menus = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void addMenu(Menu menu) {
        if (menu != null && !this.menus.contains(menu)) {
            this.menus.add(menu);
        }
    }

    public void removeMenu(Menu menu) {
        this.menus.remove(menu);
    }

    public List<Menu> getMenus() {
        return new ArrayList<>(this.menus);
    }

    public Menu getMenuByName(String name) {
        for (Menu menu : this.menus) {
            if (menu.getName().equals(name)) {
                return menu;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", menus=" + menus +
                '}';
    }
}