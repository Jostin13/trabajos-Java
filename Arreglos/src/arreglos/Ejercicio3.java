/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, n, mayor;
        i=0; n=0; mayor=0;
        System.out.println("Ingre el tamaño del vector");
        n =leer.nextInt();
        int [] A = new int [n];
        System.out.println("Ingrese los terminos del vector");
        for ( i = 0; i < n; i++) {
            System.out.println("A["+i+"]");
            A[i]=leer.nextInt();
        }
        for ( i = 0; i < n; i++) {
            System.out.println("A["+i+"]="+A[i]);
        }
        for ( i = 0; i < n; i++) {
            if (A[i]>mayor) {
                mayor =A[i];
            }
        }
        System.out.println("El numero mayor del vector es: "+mayor);
    }
}
