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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        // declaracion e inicializacion de variables
        double n;
        n = 0;
        // Datos de entrada
        System.out.println("Ingrese su calificación:");
        n = leer.nextDouble();
    
        // proceso
        if (n >= 3.0) {
        if ((n >= 4.6) && ( n <= 5.0)) {
        System.out.println("Estudiante excelente");
        }
        else {
            if ((n >= 4.1) && (n <= 4.5)) {
            System.out.println("El estudiante es muy bueno");
            }
            else{
                if ((n >= 3.6) && (n <= 4.0)) {
                System.out.println("El estudiante bueno");
            }
            else {
                if ((n >= 3.3) && (n <= 3.5)) {
                    System.out.println ("El estudiante tiene una calificacion aceptable");
               }
                else {
                    if ((n >= 3.0) && (n <= 3.2)) {
                        System.out.println("El estudiante es aprobado");
                    }
                    else{
                        if ((n >= 2.6) && (n <= 2.9)) {
                            System.out.println("El estudiante tiene una calificacion deficiente");
                        }
                        else {
                        if ((n >= 2.1) && (n <= 2.5)) {
                            System.out.println("El estudiante tinene una calificacion mala");  
                        } 
                            else {
                            if ((n >= 0.0) && (n <= 2.0)) {
                            System.out.println("El estudiante tiene una calificacion por mejorar y considerable");
                        }
                    }
                }
            }
        }
    }
}
}
}
}
}
