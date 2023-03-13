/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;


import java.util.Scanner;


public class ER13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compra, descuento;
        
        System.out.println("¿Cuanto fue el valor de la compra?");
        
        compra = sc.nextDouble();
        
        System.out.println("¿Cual es el color de la bolita?");
        
        String bolita = sc.next();
        
        if (bolita.equals("BLANCO") || bolita.equals("blanco")){
            descuento=0;
        } else if (bolita.equals("VERDE")|| bolita.equals("verde")){
            descuento = 0.1;
        } else if (bolita.equals("AMARILLO")|| bolita.equals("amarillo")){
            descuento = 0.25;
        } else if (bolita.equals("AZUL")|| bolita.equals("azul")){
            descuento= 0.5;
        } else {
            descuento= 1;
        }
        double ValPagar = compra-compra*descuento;
        System.out.println("El cliente debe pagar: $"+ ValPagar);
                
                
                
    }
}
