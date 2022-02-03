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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,j, n, aux;
        i=0; j=0; n=0; aux=0;
        System.out.println("Ingrese los elemntos de la matriz A");
        n =leer.nextInt();
        int[][] A = new int [n][n];
        System.out.println("Ingrese los elemntos de la matriz A");
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("A ["+i+"] ["+j+"]= ");
                A[i][j] = leer.nextInt();
                }
            }
        for(i = 0; i < n; i++){
            for(j = aux; j < n; j++){
                A[i][j]=0;
                if(j == n-1){
                    aux = aux+1;
                }
            }
            if(j == n-2){
            i=n;
            }
        }
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }  
}
