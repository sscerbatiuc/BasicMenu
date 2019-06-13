/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tekwill;

import java.util.Scanner;

/**
 *
 * @author sscerbatiuc
 */
public class Main {

    public static void main(String[] args) {
        // import de scanner
        Scanner sc = new Scanner(System.in);
        // pastram optiunea introdusa (int)
        // atribuim valoarea la o variabila
        System.out.println("Introduceti o optiune:");
        System.out.println("1. Suma a 2 numere");
        int option = sc.nextInt();
        String hello = "Hello";
        char letter = 'A';
        switch(letter){
            case 'A':
            case 'a':
                if(letter == 'A'){
                    
                }else {
                    
                }
    }
        switch (option) {
            case 1:
                System.out.println("Primul numar");
                int x = sc.nextInt();
                System.out.println("Al doilea numar");
                int y = sc.nextInt();
                Suma calc = new Suma();
                int sum = calc.sum(x,y);
                System.out.println("Suma: " + sum);
                break;
            case 2:
                // Geometry
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                break;
        }
    }
    
    // char letter
    // if(letter == 'A' || letter == 'O' ||
    // ARRAY
//    switch(st)
}
