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
public class Tabla_7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion de variables
        int num, i, reslt;
        num = 0;
        i =1;
        System.out.println("Ingrese el numero de la tabla ");
        num = leer.nextInt();
        while(i<=10){
            reslt = num*i;
            System.out.println(num +" x " +i+" = " +reslt );
            i = i+1;   
        }
    }
}