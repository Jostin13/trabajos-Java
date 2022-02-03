/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4.pkg2bfuncionesyprocedimientos;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Taller42BFuncionesyProcedimientos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i;
        n = 0; i = n;
            int []V = new int [50];
            int []C = new int (50];
            
        for (i = 0; i < n; i++){
            System.out.print ("Ingrese el elemento V["+i+"]: ");
            V[i] = leer.nextInt();
        }
        for (i=0; i<n; i++) {
        C[i] = Cuadrado_Suc(V[i]); 

        i = 0;
        while (i<n)
        System.out.println("El número contenido en la posicin "+i+" del vector");
        System.out.println (V[i]+" tiene cuadrado "+C[i]);
        i = i + 1;
        }
    }
    public static int Cuadrado_Suc(int m){
        int r, j;
        r = 0;
        j = m;
        do {
            r =r + m;
            j = j - 1;
        } while (j!=0);
        return r;
    }
}
