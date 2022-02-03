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
public class NumMayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables
        int i, n, num, mayor, menor;
        i=1; n=0; num=0; mayor=0; menor=0;
        
        //ingreso de datos 
        
        System.out.println("Encontrar el numero mayor de N numeros que ingrese el usuaro.\n");
        System.out.println("ingrese el limite de los números: ");
        n = leer.nextInt();
        
        do{
            System.out.println("\n ingrese un número: ");
            num = leer.nextInt();
            
            if (num > mayor){
                mayor = num;
            }
            i = i + 1;
        }while(i<=n);
        System.out.println("El numero mayor de los valores"+"ingresados es: " +mayor);
        System.out.println("***Encontrar el numero menor de N "+ "numeros que ingrese el usuaro.\n***");
        
        //FOR
        
        for (i=1; i<=n;i++){
            System.out.println("Ingrese el numero");
            num =leer.nextInt();
            
            if (i==1){
                menor = num;
            }
            System.out.println("***Memor <- "+ menor);
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("El numero menor es: "+menor);
    }
}


