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
        System.out.println("Hello, this is employee manager. Choose option:");
        System.out.println("1. Add employees");
        System.out.println("2. Edit employees");
        System.out.println("3. Print employees");
        System.out.println("4. Delete employees");

        final int option = keyboard.nextInt();

        switch (option) {
            case 1:
                System.out.println("Please enter how many employees do you want to add.");
                short count = keyboard.nextShort();
                EmployeeService empService = new EmployeeService(count);
                for (short i = 0; i < count; i++) {
                    System.out.println("-> " + (i + 1) + " Name?");
                    String name = keyboard.next();
                    System.out.println("-> " + (i + 1) + " Surname?");
                    String surname = keyboard.next();
                    System.out.println("-> " + (i + 1) + " IDNP?");
                    String idnp = keyboard.next();
                    empService.create(i, name, surname, idnp);
                }
                empService.print();
            case 2:
            case 3:
            case 4:
        }

    }
}
