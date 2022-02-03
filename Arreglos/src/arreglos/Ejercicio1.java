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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i;
        n =5;
        int[] A =new int[n];
        int []B=new int[n];
        for ( i = 0; i < n; i++) {
            System.out.println("Ingrese el vector A["+i+"]:");
            A[i] = leer.nextInt();
            System.out.println("Ingrese el vector B["+i+"]:");
            B[i] = leer.nextInt();
        }
        for ( i = 0; i < n; i++) {
            System.out.println("A["+i+"]= "+A[i]);
        }
        for ( i = 0; i < n; i++) {
            System.out.println("B["+i+"]= "+B[i]);
        }
        for ( i = 0; i < n; i++) {
            if (A[i]==B[i]){
                System.out.println("El vector A es = a "+A[i]+"y el vector B es = a "+B[i]+" son los mismos");
            }
            
        }
        
    }
}
