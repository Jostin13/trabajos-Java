/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionpirmerbimestre;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables
        int num, i, n, mayor, menor;
        i=0; n=0; mayor=0; menor=0;
        boolean multiplo3;
        multiplo3=false;
        for (i=1;i<=2;i++){
            System.out.println("Introduzca un numero: ");
            num = leer.nextInt();
            if(num%3==0){
                multiplo3=true;
            }
            if(multiplo3==false){
                System.out.println("no hay multiplos de 3");
            }
            System.out.println("Introduzca es segundo numero: ");
            num = leer.nextInt();
            if(num%3==0){
                multiplo3=true;
            }
            if(multiplo3==false){
                System.out.println("no hay multiplos de 3");
            }
            do{
                num = leer.nextInt();
                if (num > mayor){
                    mayor = num;
                }
                System.out.println("***Menor <- " +menor);
            }while (num < menor);
                menor = num;
            }
            System.out.println("El numero menor es: "+menor);
        }
    
    }
