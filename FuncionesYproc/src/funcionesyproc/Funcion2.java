/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesyproc;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Funcion2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        boolean band;
        System.out.println("Funcion para verificar si un numero es positivo o negativo \n");
        System.out.println("Ingrese el numero a verificar ");
        num = leer.nextInt();
        
        band = FunNegPos(num);//se asigna el valor que devulva la funcion
        
        if (band == true) {
            System.out.println("El numero " +num + "es positivo");
        }
        else{
            System.out.println("El numero " +num + "es negativo");
        }
        System.out.println("*****Fin de funcion 1 *******");
        //comprobar directamente con el llamado a la funcion 
        if (FunNegPos(num)== true) {
            System.out.println("El numero " +num + "es positivo");
        }
        else{
            System.out.println("El numero " +num + "es negativo");
        }
        System.out.println("*****Fin de funcion 2 *******");
    }
    public static boolean FunNegPos(int numero) {
        if (numero > 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
