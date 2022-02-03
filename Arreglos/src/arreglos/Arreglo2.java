/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Arreglo2 {
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
        int[]A=new int[n];
        // ingrese los datos del vector 
        System.out.println("Ingrese los elemntos del vector");
        for(i=0;i<n; i++){
            System.out.println("A["+i+"]:");
        }
        //presentar el vector original 
        System.out.println("\n--Vector original--");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
        for(i=0;i<n; i++){
            for(j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    aux=A[i];
                    A[i]=A[j];
                    A[j]=aux;
                }
            }
        }
        System.out.println("\n--Vector ordenado--");
        for(i=0; i<n; i++){
            System.out.println("A["+i+"]="+A[i]);
        }
    }
    
}
