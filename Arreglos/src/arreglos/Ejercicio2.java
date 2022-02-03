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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, n, bsc, aux;
        n=0; bsc=0; aux=0;
        System.out.println("Ingrese el tamaño del vector");
        n=leer.nextInt();
        int [] A = new int [n];
        for(i=0; i<n; i++){
            System.out.println("Ingrese los terminos del vector");
            A[i]=leer.nextInt();
        }
        System.out.println("Vector original");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
        System.out.println("Ingrese el numero a buscar");
        bsc=leer.nextInt();
        for(i=0; i<n; i++){
            if (bsc==A[i]){
                aux=aux+1;
                System.out.println("Su posicion es:A["+i+"]");
            }
        }
        System.out.println("El numero ingresado se repite "+aux+" veces en el vector");
    }
}
