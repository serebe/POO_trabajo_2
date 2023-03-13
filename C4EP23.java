/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;

public class C4EP23 {
    public static void main(String[] args) {
        // Según el enunciado, la funcion seria de la forma: Ax^2+Bx+C
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double b = entrada.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double c = entrada.nextDouble();

        double discriminante = b * b - 4 * a * c;

        // Es por si tiene solucion en los reales
        if (discriminante < 0) {
            System.out.println("La ecuación no tiene solución real");
        } else {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            
            // Mostrar las soluciones
            System.out.println("Las soluciones de la ecuación son: x1 = " + x1 + " y x2 = " + x2);
        }
    }
}

