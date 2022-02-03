/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class matriz2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, n, m, j, suma;
        i=0; n=0; m=0; j=0; suma=0;
        //Ingrese el tamaño de la matriz 
        System.out.println("Ingrese el numero de filas");
        n =leer.nextInt();
        System.out.println("Ingrese el numero de columnas");
        m =leer.nextInt();
        
        //Ingrese los elementos de la matriz
        System.out.println("\nIngrese los elemntos de la matriz");
        int[][]A=new int[n][m];
        for (i = 0; i < n; i++) {
            for (j = 0;  j < m; j++) {
                System.out.println("A["+i+"]["+j+"}= ");
                A[i][j] =leer.nextInt();
            }  
        }
        System.out.println("La matriz A es: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                
                System.out.println(A[i][j]+" ");
                
            }
            System.out.println("");
        }
        int[] B= new int[n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                suma = suma + A[i][j];
            }
            B[i] = suma;
            suma = 0;
        } 
        System.out.println("\n la suma de los vectes B es: ");
        for (int k = 0; k < n; k++) {
            System.out.println(B[k]+" ");
            
        }
    }
}
