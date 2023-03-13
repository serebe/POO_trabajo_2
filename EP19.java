/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

/**
 *
 * @author jucar
 */
import java.util.Scanner;

public class EP19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud del lado del triangulo equilatero");
        float L = entrada.nextFloat();
        double Peri, h, A;
        Peri=3*L;
        A=Math.sqrt(3)*Math.pow(L,2)/4;
        h=Math.sqrt(3)*L/2;
        System.out.println("El perimetro del triangulo es: "+ Peri);
        System.out.println("La altura del triangulo es: "+ (float)h);
        System.out.println("El area del triangulo es: "+ (float)A);
    }
}