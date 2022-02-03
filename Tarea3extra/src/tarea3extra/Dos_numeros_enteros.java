/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3extra;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Dos_numeros_enteros {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double num1, num2, resta;
        num1=0; num2=0; resta=0;
        //entrada de datos
        System.out.print("ingrese el primer número:\n");
        num1 = leer.nextDouble();
        System.out.print("ingrese el segundo número:\n");
        num2 = leer.nextDouble();
        //datos de salida
        if(num1>num2){
            resta = num1-num2;
            System.out.println("el resultado de la resta es: " + resta + " .\n" );
        }
        else{
            if(num2>num1){ 
                resta= num2 - num1;
                System.out.println("el resultado de la resta es: " + resta + " .\n" );
            }
            
        }
        if ((num1 % resta ==0 ) || (num2 % resta ==0)){
            System.out.println("la diferencia es un divisor exacto de uno de los números.");
        
        }
        else {
            System.out.println("la diferencia no es un divisor exacto de ningún número");
        }
    }
    
}
