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
public class Matriz3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, j;
        n=0; i=0; j=0;
        System.out.println("---Operaciones sobre matrices cuadradas---");
        System.out.println("Ingrese el tamaño de la matris cuadrada: ");
        n =leer.nextInt();
        
        //Ingrese los elementos de la matriz
        int[][]A= new int[j][j];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println(A[i][j]+" ");
            }
            System.out.println("Cambiar por 0 la diagonal principal");
            for (i = 0; i < n; i++) {
                for (j = 0; j < 10; j++) {
                    if (i==j) {
                        A[i][j]=0;
                    }  
                }
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.println(A[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Cambiar por 1 la diagonal secundaria");
            for (i = 0; i < n; i++) {
                for (j = 0; j < 10; j++) {
                    if ((i+j)==(n-1)) {
                        A[i][j]=1;
                    }  
                }
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.println(A[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
