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
        this.number = number;
    }

    public boolean isValid(){
        number.replaceAll("[\\s-]+", "");
        if (number.matches("\\d{9}")){
            return true;
        } else {
            this.number = "XXXX";
            return false;
        }
    }
}
