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
public class Matriz4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j, n, par;
        n=0; i=0; j=0; par=0;
        System.out.println("---Ejercicio4-MATRICES---");
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int[][]A = new int[i][j];
        System.out.println("Cambiar por 0 los elemntos pares de la matriz");
            for (i = 0;  i < n; i++) {
            for (j = 0; i < n; j++){
                 if ((i==n-1)||(j==n-1)){
                     A[i][j] = 1;
                    }
                }
            }
            
    }
}
