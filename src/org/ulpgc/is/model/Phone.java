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

    // Método para validar el número de teléfono.
    // La validación específica dependerá de tus requisitos, como la longitud del número,
    // si debe contener solo dígitos, prefijos específicos, etc.
    public boolean isValid() {
        // Ejemplo de validación básica: número de 10 dígitos sin caracteres especiales ni letras
        return number.matches("\\d{10}");
    }
}

