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
public class ExceptionU9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        int nota1 = 9;
        int nota2 = 0;
        int notaFinal = nota1/nota2;
        System.out.println("La nota final es: "+notaFinal);
        }
        catch(ArithmeticException)
    }
    
}
