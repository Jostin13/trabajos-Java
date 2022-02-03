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
public class Factorial {
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       //declaracion e inicializacion de variables 
       double factorial = 1;
       double numero = 30; 
       
       while (numero!=0) {
       factorial=factorial*numero; numero--;
       }
       System.out.println(factorial);
    }
}
