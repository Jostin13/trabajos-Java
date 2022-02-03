/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4estructuraslógicasrepetitivas;

/**
 *
 * @author ASUS TUF
 */
public class NumerosPares2al100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        //declaracion e inicializacion de variables
        System.out.println("Programa para ver los numero pares del 2 al 100");
        //declaracion e inicializacion de variables
        int i, n, num;
        i =1; n =99; num =1;
        //proceso
        for(i=1;i<=99;i++){
            if (num%2==0){
                System.out.println("el numero para: " +num+"");
            }
            num=num+1;
        }
        do {
        System.out.println(i);
        i+=0;
        }while(i <= 99);
        
    }  
       
}   
