/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Empleado {
 
    String nombre;
    double sueldo;   
    Scanner sc = new Scanner(System.in);
    public Empleado(){                
    }
    
   
    public double setSaldo(double p_saldo){

        return sueldo=p_saldo;
    }

    /**
     *
     */
    public void pedirDatos(){
        System.out.println("Sueldo Empleado");
        sueldo = sc.nextDouble();                      
    
    }
    public void Calculo(){
        double contadorEmp=0;
        double contadorEmpPor=0;
        sueldo=1;
        while(sueldo!=0){    
            pedirDatos();
            if ((sueldo >=1000) && (sueldo <=1750)){
                contadorEmp++;
                System.out.println(contadorEmp);
            }
                else if (sueldo<1000){
                    contadorEmpPor++;
                    System.out.println(contadorEmpPor);
                 
                }
           
        }   
        System.out.println(contadorEmp+"----"+contadorEmpPor);
        contadorEmp= contadorEmp +contadorEmpPor;
            double Porcentaje=((contadorEmp*contadorEmpPor));
        
            System.out.println(" ,Porcentaje "+Porcentaje+"%");           
        
    
    }
    
    
    @Override
    public String toString(){
    
        return (" sa");
    }
}
