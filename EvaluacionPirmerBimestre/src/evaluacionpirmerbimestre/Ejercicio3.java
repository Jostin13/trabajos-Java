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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables
        int i, n, num1, num2, pot, j;
        i=1; n=0; num1=1; num2=7; pot=2;j=0;
        System.out.println ("Ingrese el numero liminte");
        n = leer.nextInt ();
        //Procesi
        do{
            if (num1<=1) {
                System.out.println ("el numero es: (" +num1+"^" +pot+" /" +num2+ ") ");
                num1 = num1 + 1;
                pot = pot + 1;
                i=i+1;
                j=j+3;
                num2=num2+j;
            }
        else
            if(num1 == 2){
                System.out.println("El numero es: (" +num1+"^" +pot+" / " +num2+")");
                num1 = num1 - 1;
                j=j+3;
                pot = pot + 2;
                i=i+1;
                num2 =num2 + j;
            }
         }while (i<=n);
    }
}
