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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, aux;
        n=0; i=0; aux=0;
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        int [] A = new int [n];
        int par[]=new int [n];
        int impar[]=new int [n];
        for (i = 0;  i < n; i++) {
            System.out.println("Ingrese los terminos del vector");
            A[i] =leer.nextInt();
        }   
        System.out.println("Vector original");
        for (i = 0; i < n; i++) {
            System.out.println("A["+i+"]="+A[i]);
        }
        for (i = 0; i < n; i++) {
            if(A[i]%2==0){
                par[i]=A[i];
                aux=par[i];
                System.out.println("Pares"+i+" : "+par[i]);
            }
            for (i = 0; i < n; i++) {
                if (A[i]%2!=0) {
                    impar[i]=A[i];
                    aux=impar[i];
                    System.out.println("Impares "+i+" : "+impar[i]);
                }
            }
        }
    }
}
