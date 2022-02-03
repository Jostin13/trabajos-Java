/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionparcial;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j, n, k;
        i = 0; j = 0; n = 0; k = 0;
        
        System.out.println("ingrese el limite de la matriz");
        n = leer.nextInt();
        
        int[][] A = new int[n][n];
        
        System.out.println("Ingresar los elementos de la matriz");
        for (i = 0;  i < n; i++) {
            for (j = 0; j < n; j++){
                    System.out.println("A[" +i +"][" +j +"] = ");
                    A[i][j] = leer.nextInt();     
            }
        }
        for (i = 0;  i < n; i++) {
            for (j = 0; j < n; j++){
                if (A [i][j] == A[j][i]){
                    k++;
                }
            }
        }
        if (k == n*n){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("No es simetrica");
        }
    }
}
