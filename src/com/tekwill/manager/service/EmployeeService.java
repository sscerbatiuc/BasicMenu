package com.tekwill.manager.service;

import com.tekwill.manager.domain.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeService {
    // 1 atribut - array
    Employee[] empArray;

    public EmployeeService(){
        
    }
    
    public void init(short count){
        empArray = new Employee[count];
    }
    
    public void create(short index, String name, String surname, String idnp){//index - stabileste pozitia 
        Employee emp = new Employee(name, surname, idnp);
        empArray[index] = emp;
    }
    
    public void edit(short position, String name, String surname , String idnp){
       empArray[position-1].setName(name);
       // aici adaugam metode set... pentru fiecare atribut
    }
    public void printEl(short position){
    System.out.println (empArray[position-1]);
    }
    
    public void print(){
    int i = 1;
    for(Employee el: empArray){
        System.out.println(i++ + " " + el);
            
        }
    }
    
    public void delete(short position){
        System.out.println("Am sters elementul " + empArray[position-1] + " de pe pozitia " + position);
        empArray[position-1] = null;
    }
}
