/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerap;

import java.util.Scanner;


public class ER14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double V1,V2,V3,salario;
        double S1,S2,S3;
        
        System.out.println("¿Cuanto vendió el primer departamento?");
        V1= sc.nextDouble();
        System.out.println("¿Cuanto vendió el segundo departamento?");
        V2= sc.nextDouble();
        System.out.println("¿Cuanto vendió el tercer departamento?");
        V3= sc.nextDouble();
        System.out.println("¿Cuanto es el salario de los vendedores?");
        salario= sc.nextDouble();
        Double exced=(V1+V2+V3)*0.33;
        if (V1>exced){
            S1= salario+salario*0.2;
        } else{
            S1= salario;
        }
        if (V2>exced){
            S2= salario+salario*0.2;
        } else{
            S2= salario;
        }
        if (V3>exced){
            S3= salario+salario*0.2;
        } else{
            S3= salario;
        }
        System.out.println("Salario de vendedores del Dpto. 1 es: $" + S1);
        System.out.println("Salario de vendedores del Dpto. 2 es: $" + S2);
        System.out.println("Salario de vendedores del Dpto. 3 es: $" + S3);
        
        
                
                
                
    }
}
