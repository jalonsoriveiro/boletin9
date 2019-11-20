/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

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
        System.out.println(" Teclea Numero para multiplicar:");
         num = sc.nextInt();
        //System.out.println(" Teclea Altura :");
         //altura = sc.nextInt();
    
    }
    int contador=1;
    int tabla;
    public void calcularTabla(){
        //4- Codifica un programa que solicite  un número e,
        //visualice a táboa de multiplicar dese número. O programa rematara cando prememos o cero.
       while(num==0){
           contador=1;
        pedirNumero();
            if(num!=0){
                while(contador<10){
                      contador++;                      
                      tabla =num * contador;                     
                    // System.out.println("contadore  "+contador);
                     System.out.println(tabla);            
                            if (contador ==10){
                                   num =0;
                            }}
             }
             else
                num =1;
     }

    }
    public void calcularTablafor(){
        //4- Codifica un programa que solicite  un número e,
        //visualice a táboa de multiplicar dese número. O programa rematara cando prememos o cero.
       pedirNumero();
        while(num!=0 && num<11){
                    for(int cont=0;cont<11;cont++){                  
                      tabla =num * cont;                          
                     System.out.println(num+"*"+cont+"="+tabla);            
                    }                
            pedirNumero();
            }
    }
}
