package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para crear contactos.
 * @author alejandro
 * @version 1.0
 */

class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}