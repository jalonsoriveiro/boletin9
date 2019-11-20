/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Calculos {
    int num=0;
    Scanner sc = new Scanner(System.in);            
    public Calculos(){
    
    }
    public int  pedirNumero(){
        System.out.println(" Teclea numero :");
        return num = sc.nextInt();
    
    }
/*1. Calcula a cantidade de números negativos, positivos e, ceros  que hai nun grupo de 10 numeros .*/
    
    public void calcularTipoNumero(){
    int calcularSuma=0;
    double calcularProducto=1;
    //int contadorCero=0;
    //int contador=0;    
        /*Realiza un programa que calcule a suma e o producto dos números comprendidos entre 10 e 90 .*/
        for(int contador=10;contador<=90;contador++){  
           calcularSuma =calcularSuma +contador;           
           calcularProducto = calcularProducto * contador;            
        }         
        System.out.println("*** Saimos do bucle ***\n Suma "+calcularSuma
        +" Total producto "+calcularProducto);
    }
    
}
