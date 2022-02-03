/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, j;
        int aux;
        n=0; aux=0; 
        
        //pedir el limite del vector
        System.out.println("--Ordenar un vector de N elementos--\n ");
        System.out.println("Ingrese el tamaño del vector");
        n = leer.nextInt();
        
        //declarar el vector
        int[][]A = new int[n][n];
        // ingrese los datos del vector 
        System.out.println("Ingrese los elemntos del vector");
        for(i=0;i<n; i++){
            for (j=0; j<n; j++){
                System.out.println("A[" + i + "][" + j + "] = ");
                A[i][j] = leer.nextInt();
            }
        }
        //presentar el vector original 
        System.out.println("\n--Vector original--");
        for(i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.println("A["+i+"]["+j+"]" +A[i][j]);
            }
            System.out.println("");
        }
        //matriz ordenada
        for( i=0; i < n; i++){//ordena la matriz de abajo hacia arriba
            for( j = 0; j< n; j++){
		for(int x=0; x < n; x++){
                    for(int y=0; y <n; y++){
			if(A[i][j] > A[x][y]){
			aux = A[i][j];
			A[i][j] = A[x][y];
			A[x][y] = aux ;
			}
                    }
                }
            }
        }
        System.out.println("\n--Vector ordenado--");
        for(i = 0; i < n; i++){
            for (j = 0; j < n; j++){
                System.out.println("A["+i+"]["+j+"]" +A[i][j] + " ");
            }
            System.out.println("");
        }
        for(i=0; i<A.length;i++){
            for(j=0; j<A.length; j++){
                System.out.print(A[i][j] + "   ");
            }
            System.out.println("");
        }
    }
    
}
