package org.example;

import java.util.*;

/**
 * Clase para almacenar los contactos en la agenda
 * @author Alejandro
 * @version 1.0
 */
public class agendaContactos implements Agenda1 {
    private List<Persona> contacts; // Lista de Contacto

    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Tenemos dos parámetros, nombre y número de teléfono.
     * Si añadimos nombre que ya existe nos pedirá número de teléfono.
     * @param name
     * @param phone
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    public List<Persona> getContacts() {
        return this.contacts;
    }
}