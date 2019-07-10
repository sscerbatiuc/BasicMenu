package com.tekwill.manager;

import java.util.Scanner;
import com.tekwill.manager.service.EmployeeService;

/**
 *
 * @author sscerbatiuc
 */
public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nHello, this is employee manager. Choose option:");
        
        short option, position;
        EmployeeService empService;
        empService = new EmployeeService();
        
        do {
        System.out.println("1. Add employees");
        System.out.println("2. Edit employees");
        System.out.println("3. Print employees");
        System.out.println("4. Delete employees");
        System.out.println("5. Exit");  
        option = keyboard.nextShort();
        
        switch (option) {
            case 1:
                System.out.println("Please enter how many employees do you want to add.");
                short count = keyboard.nextShort();
                empService.init(count);
                for (short i = 0; i < count; i++) {
                    System.out.println("-> " + (i + 1) + " Name: ");
                    String name = keyboard.next();
                    System.out.println("-> " + (i + 1) + " Surname: ");
                    String surname = keyboard.next();
                    System.out.println("-> " + (i + 1) + " IDNP: ");
                    String idnp = keyboard.next();
                    empService.create(i, name, surname, idnp);
                }
                empService.print();
                break;
            case 2:
                
                System.out.println("Please enter the position do you want to edit.");//aficem ce dorim ce sa facem
                empService.print();
                position = keyboard.nextShort();//selectem pozitia elemetutului
                empService.printEl(position);//trimitem pozitia array-lui care doresc sa fie afisat- si il afiseaza 
                    System.out.println(position + " New Name: ");
                    String name = keyboard.next();
                    System.out.println(position + "New Surname: ");
                    String surname = keyboard.next();
                    System.out.println(position+ "New IDNP: ");
                    String idnp = keyboard.next();       
                
                
                empService.edit(position , name, surname, idnp);//trimitem positia catre metoda edit
                
                break;
            case 3:
                empService.print();
                break;
            case 4:
                System.out.println("Please enter the position do you want to remove.");
                empService.print();
                position = keyboard.nextShort();
                empService.delete(position);
                empService.print();
                break;
                
            }
        } while (option !=5);
    }
}
