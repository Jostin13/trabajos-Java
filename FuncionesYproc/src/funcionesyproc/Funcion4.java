/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesyproc;
import java.util.Scanner;
import static funcionesyproc.Funcion3.Impar;
/**
 *
 * @author ASUS TUF
 */
public class Funcion4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num = 0;
        boolean esImpar, esPrimo;
        System.out.println("Funcion para verificar si un numero es impar y primo \n");
        System.out.println("Ingrese el numero a verificar: ");
        num = leer.nextInt();
        esImpar = Impar(num);
        if (esImpar == true) {
            esPrimo = Primo(num);
            
            if (esPrimo == true) {
                System.out.println("El numero "+num+" es impar y es primo");
            }
            else{
                System.out.println("El numero "+num+" es impar pero no es primo");
            }
        }
        else{
            System.out.println("El numero "+num+" no es impar por lo tanto no se verifica que sea primo \n");
        }
    }
    public static boolean Primo(int numero) {
        int div = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                div = div + 1;
            }
        }
        if(div == 2){
            return true;
        }
        else{
            return false;
        }
    }
}