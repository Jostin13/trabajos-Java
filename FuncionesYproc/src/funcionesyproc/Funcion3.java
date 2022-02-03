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
public class Funcion3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        boolean esImpar;
        System.out.println("Funcion para verificar si un numero es impar y un procedimiento " 
                + "para verificar si es primo");
        System.out.println("Ingrese el numero a verificar: ");
        num = leer.nextInt();
        esImpar =Impar(num);
        if (esImpar == true){
            Primo(num);
        }
        else{
            System.out.println("El numero es impar por lo cual no se verifica si es primo");
        }
    }
    public static boolean Impar(int numero){
        if (numero % 2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void Primo(int numero){
        int div = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                div = div + 1;
            }
        }
        if (div == 2) {
            System.out.println("El numero " +numero +" es impar y es primo");
        }
        else{
            System.out.println("El numero " +numero +" es impar y no es primo");
        }
            
    }
}

