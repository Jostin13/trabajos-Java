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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables 
        Scanner teclado = new Scanner (System.in);
        int i, n, mult, num, meno, primo, x;
        i =1; n =0; num =1; mult =5; meno =0; primo =1;
        System.out.print("Ingrese un número: ");
        n = teclado.nextInt ();
        if (n % 2 == 0) {
        System.out.println (n+" es un número par.");
        }else {
            System.out.println (n+" no es un número par.");
        }
        num = leer.nextInt();
        if (num<0){
            System.out.println("El nuemro es negativo");
        }
        else{
            System.out.println("El numero es positivo");
        }
        if (num % mult == 0) {
            System.out.printf("%d es múltiplo de %d", num, mult);
        } else {
            System.out.println("No es múltiplo");
        }
        for(primo=1;primo<= num;primo++){
        if (num%1==0){
            meno++;
        }
        
        }
        if (meno!=0){
            System.out.println("No es primo");             
                }else{
                    System.out.println("Si es primo");
                }
    }
}
        
