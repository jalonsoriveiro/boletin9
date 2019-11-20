/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Calculos {
    int num=0;
    float altura=0;
    Scanner sc = new Scanner(System.in);            
    public Calculos(){
    
    }
    public Calculos(int num,int altura){
    
        this.num = num;
        this.altura = altura;
    }
    public void pedirNumero(){
        System.out.println(" Teclea base:");
         num = sc.nextInt();
        //System.out.println(" Teclea Altura :");
         //altura = sc.nextInt();
    
    }
      /*      5- Implementa un programa no que se pida o número de elementos e, visualice a seguinte serie :
            a)  2 + 4 + 6 + 8 + 10 …..
            b)  - 1 + 2 – 3 + 4 – 5 + 6 …..
            c)  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 ………*/
    int suma=0;
    int resta=0;
    int tabla;
    public void calcularSerie(){
        pedirNumero();
       for (int cont=0;cont!=num;cont++){
           suma = suma +2;
           System.out.print(suma +" + ");                   
           
       }
        System.out.println("\n");
        suma=0;
        resta=1;
       for (int cont=0;cont!=num;cont++){
           resta = resta -2;
           suma = suma +2;
           System.out.print(" "+resta +" + "+suma);                   
           
       }
        System.out.println("\n");
        int  primero=0;       
        int  segundo=1; 
       
        for (int cont=0;cont!=num;cont++){
             if (cont==0) {
                System.out.print(primero+","+segundo+",");
            }else if(cont==3) {
                primero=primero+segundo;
                segundo=primero+segundo;
                System.out.print(primero+","+segundo);
            }else {
                primero=primero+segundo;
                segundo=primero+segundo;
                System.out.print(","+primero+","+segundo+",");
            }
           
       }

    }
    
}
