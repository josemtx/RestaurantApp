package org.ulpgc.is.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public boolean isValid() {
        number.replaceAll("[\\s-]+", "");
        return number.matches("(\\+34|0034)?[67]\\d{8}");
    }

    public String getNumber() {
        return number;
    }

    public void setNumber() {
        Boolean num = isValid();
        if (!num) {
            this.number = "XXXX";
        }
    }
}///socorro