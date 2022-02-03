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
public class VectorPorEscalar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i, escalar;
        n = 0; escalar =0;
        System.out.println("Ingrese el tamaño del vector");
        n =leer.nextInt();
        int []A=new int[n];
        int []B=new int[n];
        System.out.println("Ingrese el escalar");
        escalar = leer.nextInt();
        //Ingrese los elemontos del vector
        for (i=1; i<=n; i++){
            System.out.println("Ingrese el elemento[" +i+"]:");
            A[i]=leer.nextInt();
        }
        //multiplicar por el escalar
        for (i=1; i<=n; i++){
            B[i]=A[i]*escalar;    
        }
        //presentar el vector B
        for (i=1;i<=n; i++){
            System.out.println("B[" +i+"]=" +B[i]);
        }
        
    }
    
}
