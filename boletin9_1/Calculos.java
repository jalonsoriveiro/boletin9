/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

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
    int contadorPares=0;
    int contadorImpares=0;
    int contadorCero=0;
    int contador=0;    
        do{
            contador++;
            num=pedirNumero();
        if (num==0){ //numero 0
            contadorCero++;
        }                
        else if((num%2)==0){ //pares
            contadorPares ++;                  
        }
        else if ((num%2)!=0){ //impares
            contadorImpares ++;
        }       
        }while(contador!=10);
        System.out.println("*** Saimos do bucle ***\n Cantidad de 0: "+contadorCero 
                +"\n Cantidad de pares "+contadorPares
                +"\nCantidad de impares "+contadorImpares);    
    }
    
}
