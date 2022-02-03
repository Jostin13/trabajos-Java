/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclorepetitivo;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class NumPrimos {
     public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        //declaracion e inicializacion de variables
        int n, i , num, j, divisor;
        n=0; num=0; j=1; divisor=0;
        
         System.out.println("Ingrese el limite de numero a verificar");
         n = leer.nextInt();
         for (i=1; i<=n; i++);
         
         System.out.println("Ingrese un numero ");
         num = leer.nextInt();
         //Verificar si un número es par o impar 
         if (num % 2==0){
             System.out.println("El numero " +num+"Es Par \n");
         }
         else{
             System.out.println("El numero "+num+"es IMPAR \n");
         } 
         //Verificar si es numero primo
         j =1;
         while(j <= num){
             if(num % j==0){
                 divisor = divisor + 1;
             }
             j = j + 1;
         }
         if (divisor ==2){
             System.out.println("El numero " +num+"Es Primo");
         }
         else{
             System.out.println("El numero "+num+"es No es Primo");
         }
         divisor =0;     
    }
}
