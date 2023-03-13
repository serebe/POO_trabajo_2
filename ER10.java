/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;

public class ER10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número de inscripción: ");
        int Inscripcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer del Scanner
        System.out.print("Ingrese el nombre completo: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese patrimonio: ");
        double patrimonio = sc.nextDouble();
        System.out.print("Ingrese el estrato social: ");
        int estrato = sc.nextInt();

        double pagoMatricula = 50000; // Valor base de la matrícula

        if (patrimonio > 2000000 & estrato > 3) {
            double incremento = patrimonio * 0.03;
            pagoMatricula += incremento;
        }

        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+ Inscripcion + "y nombre "+nombre +"debe pagar $" + pagoMatricula);
    }
}

