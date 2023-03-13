/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;


public class C4EP24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el peso de la esfera A: ");
        double A = sc.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        double B = sc.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        double C = sc.nextInt();
        

        if (A > B & A>C) {
            System.out.println("La esfera con más peso es: " +A);
        } else if (B > C) {
            System.out.println("La esfera con más peso es: " +B);
        } else {
            System.out.println("La esfera con más peso es: " +C);
        }
    }
}
