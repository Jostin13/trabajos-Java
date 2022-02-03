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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, m, i, j;
        n=0; m=0; i=0; j=0; 
        System.out.println("Ingrese la cantidad de las filas");
        n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        m = leer.nextInt();
        int[][] A = new int [n][m];
        System.out.println("Ingrese los elemntos de las matrices A");
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print("A ["+i+"] ["+j+"]= ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("la matriz original es: ");
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("La matriz transpuesta es: ");
        for(j = 0; j < m; j++){
            for(i= 0; i < n; i++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }     
}
