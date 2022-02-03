/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejercicio3 {
    public static void main(String[] args){
        
    Scanner leer =new Scanner(System.in);
    //declaracion de variables
    int n1,n2, dif;
    n1 = 0; n2 =0; dif=0;
    
    //ingrese los numeros
        System.out.println("----Programa para determinar si la diferencia de los dos numeros es"+"multiplo de alguno de ellos----");
    System.out.print("introduzca primer numero: ");
    n1=leer.nextInt();
    System.out.print("introduzca segundo numero: ");
    n2=leer.nextInt();
    //proceso
    dif = (n1 - n2);
    if ((n1 % dif ==0)&&(n2 % dif ==0)){
        System.out.println("la diferencia" +dif +" es multiplo de" +n1 +" y " +n2);
        }
        else {
            if (n1 % dif == 0) {
                System.out.println("La diferencia" +dif +" es divisor de " +n1) ;
            }
            else{
                if (n2 % dif == 0){
                    System. out.println("La diferencia" +dif +"es divisorde " +n2);
                }
                else
                    System.out.println ("La diferencia" +dif +" no es divisor de ninguno de los dos número");

            }
        }
    }
}