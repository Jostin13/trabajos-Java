/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Lab3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n = 0;
        //Ingrese el tamño de la matriz
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int[][]A= new int[n][n];//crea la matriz
        //Ingresar los datos de la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = (int)(Math.random()*50);
                
            }
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(A[i][j]+"  ");  
            }
            System.out.println();
        }
    }   
}
