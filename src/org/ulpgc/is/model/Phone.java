package org.ulpgc.is.model;

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        Boolean num = isValid();
        if (!num) {
           this.number = "XXXX";
        }
    }

    public boolean isValid(){
        number.replaceAll("[\\s-]+", "");
        if (number.matches("(\\+34|0034)?[67]\\d{8}")){
            return true;
        } else {
            return false;
        }
    }
}