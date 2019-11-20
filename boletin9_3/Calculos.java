/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Calculos {
    float base=0;
    float altura=0;
    Scanner sc = new Scanner(System.in);            
    public Calculos(){
    
    }
    public Calculos(int base,int altura){
    
        this.base = base;
        this.altura = altura;
    }
    public void pedirNumero(){
        System.out.println(" Teclea base:");
         base = sc.nextInt();
        System.out.println(" Teclea Altura :");
         altura = sc.nextInt();
    
    }
    float area=0;
    
    public void calcularArea(){
        while(area==0){
            pedirNumero();          
            if(base >0 && altura >0)
                area = base * altura;
            else 
                System.out.println("Numero negativo");            
            System.out.println(area);
        }
        //3- Implementa un programa que calcule o área dun rectángulo cuxa base e altura pides por teclado .
    //Asegurate que estos valores sexan positivos , para eso valida os datos . bas *alutra
             

    }
    
}
