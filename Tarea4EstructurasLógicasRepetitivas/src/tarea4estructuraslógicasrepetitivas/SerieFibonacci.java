/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4estructuraslógicasrepetitivas;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class SerieFibonacci {
    public static void main (String [] args) {
        Scanner leer = new Scanner (System.in);
        int num,fib1,fib2,i;
  
        do{
            System.out.print("Introduce numero mayor que 1: ");
            num = leer.nextInt();
        }while(num <= 1);
  
        System.out.println("Los " + num + " primeros términos de la serie de Fibonacci son: ");                 

        fib1=1;
        fib2=1;

        System.out.print(fib1 + " ");
        for(i=2;i<=num;i++){
            System.out.print(fib2 + " ");
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
        }
        System.out.println();
    }
}
