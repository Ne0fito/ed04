package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para crear contactos.
 * @author alejandro
 * @version 1.0
 */

class Persona {
    private String name;
    private List<String> phones;

    public Persona(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}