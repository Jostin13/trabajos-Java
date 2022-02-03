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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables
        int intento = 4;
        int clave;
        boolean acertado = false;
        //datos
        do {
        System.out.print("Ingrese la clave de 4 digitos ");
        clave = leer.nextInt();
      
        if (clave == 1234) {
            acertado = true;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
        }
        intento= intento-1;
  
        } while((intento > 0) && (!acertado));
        if (acertado) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            } else {
            System.out.println("La caja fuerte ha sido bloqueda");
        }
    }
}
