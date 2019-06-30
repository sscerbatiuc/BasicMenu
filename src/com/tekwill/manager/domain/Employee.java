package com.tekwill.manager.domain;

import java.util.Date;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {

    String name, surname, idnp;
    byte age;
    Date employedOn;

    public Employee(String name, String surname, String idnp) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
    }

    public String toString() {
        return name + " " + surname + " " + idnp;
    }

}
