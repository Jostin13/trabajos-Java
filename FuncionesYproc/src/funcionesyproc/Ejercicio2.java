/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesyproc;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, j;
        double det;
        int [][] M = new int [3][3];
        System.out.println ("Procedimiento determinante matriz orden 3");
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) {
                System.out.print ("M ["+i+"] ["+j+"] = ");
                M[i][j] = leer.nextInt();
            }
        }
        det = Sarrus(M);
        System.out.println ("El determinante de la matriz es igual a: "+det);
    }
    public static double Sarrus(int M[][]){
        int i, j, t, dc, n, m;
        int [][] A = new int [3] [5];
        double d, sumad, z, sumai, det; 
        for (i=0; i<3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print ("M["+i+"] ["+j+"] ="); 
                M[i][j] = leer.nextInt();
            }
        }
        det = Sarrus(M);
        System.out.println ("El determinante de la matriz es igual a: "+det);
    }

    public static double Sarrus(int M[][]){
        int i, j, t, dc, n, m;
        int [] [] A = new int [3] [5];
        double d, sumad, z, sumai, det;
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) {
            A[i] [j] = M[i][j];
            }
        }
        System.out.println ("*** Matriz ampliada M ***");
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) {
                System.out.print("" + A[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("*** Matriz ampliada A ***");
        for (i = 0; i < 3; i++) {
            for (j = 3; j < 5; j++) {
                A[i][j]=A[i][j-3];
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(" "+ A[i][j]);
            }
            System.out.println(" ");
        }
        i = 0;
        int k = 0;
        j = 0;
        dc = 0;
        t = 3;
        d = 1;
        sumad = 0;
        while (k<3) {            
            while((j<t)&&(t<=5)){
                d = d*A[i][j];
            }
            sumad = sumad + d;
            System.out.println("*** Suma D ["+i+"] = "+sumad);
            d = 1;
            i = 0;
            k = k + 1;
            dc = dc + 1;
            j = dc;
            t = t + 1;
        }
        i = 0; j = 2; dc = 2; k = 0;
        t = 0; z = 1; sumai = 0;
        while (k<3) {            
            while (j>=t && t<3) {                
                z = z * A[i][j];
                i = i + 1;
                j = j - 1;
                System.out.println("Z = " +z);
            }
        }
        sumai = sumai + z;
        System.out.println("*** suma I ["+i+"] = "+sumai);
        z = 1;
        i = 0;
        k = k + 1;
        dc = dc + 1;
        j = dc;
        t = t + 1;
    
    }
    System.out.println("sumad = "+sumad+ " -sumai ="+sumai);
    det = sumad - sumai;
    retun det;
}
        
        