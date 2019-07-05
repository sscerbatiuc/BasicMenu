package com.tekwill.manager.domain;

import java.util.Date;

/**
 *
 * @author sscerbatiuc
 */
public class Employee {

    private String name, surname, idnp; // encapsulare - le facem private

    public Employee(String name, String surname, String idnp) {
        this.name = name;
        this.surname = surname;
        this.idnp = idnp;
    }
    
    public void setName(String name){ // adaugam o metoda publica care ne permite sa modificam atributele private
        this.name = name;
    }
    
    // aici trebuie sa fie cate un set... pentru fiecare atribut

    public String toString() {
        return name + " " + surname + " " + idnp;
    }

}
