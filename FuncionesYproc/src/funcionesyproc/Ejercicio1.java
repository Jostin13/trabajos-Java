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
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, i;
        n = leer.nextInt();
        i = n;
        
        int []v = new int [50];
        int []c = new int [50];
            
        for (i = 0; i < n; i++){
            System.out.print ("Ingrese el elemento V["+i+"]: ");
            v[i] = leer.nextInt();
        }
        for (i=0; i<n; i++) {
        c[i] = Cuadrado_Suc(v[i]); 

        i = 0;
        while (i<n)
        System.out.println("El número contenido en la posicin "+i+" del vector");
        System.out.println (v[i]+" tiene cuadrado "+c[i]);
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

