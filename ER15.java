/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;


public class ER15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C,D;
        
        System.out.println("¿Cual es el peso de la esfera A?");
        A= sc.nextInt();
        System.out.println("¿Cual es el peso de la esfera B?");
        B= sc.nextInt();
        System.out.println("¿Cual es el peso de la esfera C?");
        C= sc.nextInt();
        System.out.println("¿Cual es el peso de la esfera D?");
        D= sc.nextInt();
        
        if (A==B && A==C){
            if (D>A){
                System.out.println("La esfera D es la diferente y es de mayor peso"); 
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso"); 
            }
                  
        } else{
            if (A==B && A==D){
                if (C>A){
                    
                    System.out.println("La esfera C es la diferente y es de mayor peso"); 
                } else {
                    System.out.println("La esfera C es la diferente y es de menor peso"); 
                }
                
            } else {
                if (A==C && A==D){
                    if (B>A){
                        System.out.println("La esfera B es la diferente y es de mayor peso"); 
                    } else {
                        System.out.println("La esfera B es la diferente y es de menor peso"); 
                    }
                
                } else {
                    if (A>B){
                        System.out.println("La esfera A es la diferente y es de mayor peso"); 
                    } else {
                        System.out.println("La esfera A es la diferente y es de menor peso"); 
                    }
                    
                }
                
                
                
                
                
                
                
            }
            
        }
        
             
    }
}
