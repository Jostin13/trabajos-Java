/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad9;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejemplo2 {
    public static void main(String[] args) {
    try{
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor 1");
        int valor1 = leer.nextInt();
        System.out.println("Ingrese el valor 2");
        int valor2 = leer.nextInt();
        int result = valor1/valor2;
        System.out.println("El resultado es: "+result);
    }
    catch(InputMismatchException ExceptionErrorEntrada){
        System.out.println("Existe un error en la entrada de dotos");
        System.out.println("de tipo: "+ExceptionErrorEntrada);
    }
    }
}
