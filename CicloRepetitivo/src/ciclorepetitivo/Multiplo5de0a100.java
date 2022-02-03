/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclorepetitivo;

/**
 *
 * @author ASUS TUF
 */
public class Multiplo5de0a100 {
    public static void main(String[] args) {
        System.out.println("Programa para saber si son multiplos de 5 de 0 a 100");
        //declaracion e inicializacion de variables
        int i, n, mult, num;
        i =1; n =100; num =1; mult =0;
        //proceso
        for(i=1;i<=100;i++){
            if (num%5==0){
                System.out.println("el numero " +num+"es multiplo de 5");
            }
            num=num+1;
        }
        do {
        System.out.println(i);
        i+=5;
    }   while(i <= 100);
    }
    
}
