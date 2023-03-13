/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;

public class EP21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A, B, C;
        double P,SP, heron;
        System.out.println("Ingrese el primer lado del triangulo");
        A= entrada.nextFloat();
        System.out.println("Ingrese el segundo lado del triangulo");
        B= entrada.nextFloat();
        System.out.println("Ingrese el tercer lado del triangulo");
        C= entrada.nextFloat();
        
        P=(A+B+C);
        SP= P/2;
        // El area fue encontrada por la formula de herón 
        heron=Math.sqrt(SP*(SP-A)*(SP-B)*(SP-C));
        System.out.println("El perimetro del triangulo es: " + P);
        System.out.println("El semiperimetro del triagnulos es: " + SP);
        System.out.println("El area del triangulo es: " + (float)heron);
    }
}
