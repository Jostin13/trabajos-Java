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
public class Taller2Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, j, i, k, l, menor;
        menor=0; n=0; l=0; k=0;
        System.out.print("Ingrese el tamaño de la matriz cuadrada: ");
        n = leer.nextInt();
        
        int[][] A = new int [n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("A ["+i+"] ["+j+"] = ");
                A[i][j] = leer.nextInt();
                }
            }
        
        
        for (i = 0; i < n; i++) {
            for (j = 0; j <n ; j++) {
                System.out.print(A[i][j] + "  ");
                
            }
            System.out.println("");
        }
        
        for(i=0;i<n;i++){
            menor = A[i][0];
            for(j=0;j<n;j++){
                if(A[i][j]< menor){
                    menor = A[i][j];
                    k= i;
                    l = j;
                           
                }
            }
            System.out.println("El elemento menor de la fila " +i + " es "
                    +menor+" y está en A["+i+"]["+ l +"]");
            
            k=0;
            j=0;
            
        }
    }
}
