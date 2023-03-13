/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;

public class C4EP22 {
    public static void main(String[] args) {
        // Pedir información del empleado
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = entrada.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = entrada.nextInt();

        double salarioMensual = salarioPorHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("El salario mensual de " + nombre + " es de: $" + salarioMensual);
        } else {
            System.out.println(nombre);
        }
    }
}
