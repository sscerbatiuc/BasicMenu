package com.tekwill.manager.service;

import com.tekwill.manager.domain.Employee;

/**
 *
 * @author sscerbatiuc
 */
public class EmployeeService {
    // 1 atribut - array
    Employee[] empArray;

    public EmployeeService(short count){
        empArray = new Employee[count];
    }
    
    public void create(short index, String name, String surname, String idnp){
        Employee emp = new Employee(name, surname, idnp);
        empArray[index] = emp;
    }
    
    public void update(){
        
    }
    
    public void print(){
        for(Employee el: empArray){
            System.out.println(el);
        }
    }
    
    public void delete(){
        
    }
}
