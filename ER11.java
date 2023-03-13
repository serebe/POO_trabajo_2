/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;


public class ER11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor A: ");
        int A = sc.nextInt();
        System.out.print("Ingresa el valor B: ");
        int B = sc.nextInt();
        System.out.print("Ingresa el valor C: ");
        int C = sc.nextInt();
        

        if (A > B & A>C) {
            System.out.println("El mayor entre " + A +" "+B +" y "+C +" es: " +A);
        } else if (B > C) {
            System.out.println("El mayor entre " + A +" "+B +" y "+C +" es: " +B);
        } else {
            System.out.println("El mayor entre " + A +" "+B +" y "+C +" es: " +C);
        }
    }
}