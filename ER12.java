/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;


public class ER12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del trabajador: ");
        String nombre = sc.nextLine();
        System.out.print("Ingresa el número de horas que trabajó en la semana: ");
        int horas = sc.nextInt();
        System.out.print("Ingresa el valor por hora de trabajo ");
        int valor = sc.nextInt();
        

        if (horas>40) {
            int extras = horas-40;
            if (extras >8){
                int extras2 = extras-8;
                int salario= valor*40 + valor*2*8 + valor*3*extras2;
                System.out.println("El trabajador "+nombre+ " devengó $"+ salario);
            } else{
                int salario=valor*40 + valor*extras;
                System.out.println("El trabajador "+nombre+ " devengó $"+ salario);
            }
        } else {
            System.out.println("El trabajador "+nombre+ " devengó $"+ valor*horas);
        }
    }
}
