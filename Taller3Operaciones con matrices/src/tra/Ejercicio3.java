/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tra;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, j;
        i=0; j=0; n=0;
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int[][]A=new int[n][n];
        int[][]B=new int[n][n];
        int [][]C=new int[n][n];
        System.out.println("Ingrese los elemntos de las matrices A");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("A ["+i+"] ["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("B ["+i+"] ["+j+"]= ");
                B[i][j] = leer.nextInt();
            }
        }
        System.out.println("la matriz original A es: ");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("la matriz original B es: ");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("La suma de las matrices A y B es: ");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
