/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner leer = new Scanner (System.in);
        
        //declaracion e inicializacion de variables 
        int n, divisor, num, menor, i, j, primo;
        n =1; divisor =0; num =1; menor =0; i =1; j =1; primo =0;
        System.out.println("Ingrese el limite ");
        n = leer.nextInt();
        
        //datos
        while (i<=n){   
            System.out.println("Ingresa el numero");
            num = leer.nextInt();
            
            for (j=1; j<=num; j++){
                if (num%j==0){
               
                    divisor =divisor+1; 
                }
            }
            if(divisor ==2){
                primo =primo+1;
                if (primo ==1){
                    menor=num;
                }
                if (num <menor){
                    menor=num;
                }  
            }
            
            divisor=0;
            i=i+1;
            
        }
        System.out.println("El menor de los primos es: " +menor);
        
        
    }
}