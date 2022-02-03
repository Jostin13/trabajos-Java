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
public class Taller2ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int  i = 0, j, k, n, m, c, codigo;
        n=0; m=0; k=0; codigo = 0; j=0;
        
        System.out.println("N´umero de aspirantes que se va a seleccionar");
        n = leer.nextInt();
        
        System.out.println("N´umero de aspirantes del proceso de selecci´on");
        m = leer.nextInt();
        
        System.out.println("N´umero de criterios que se va a utilizar en la selecci´on");
        k = leer.nextInt();
        
        int [] Codigo= new int[50];
        int [][] C = new int [50][50];
        int [] Media = new int[50];
        int [] P = new int[50];
        int [] Pond = new int [50];
        
        for(i = 1;i<m;i++){
            System.out.println("Codigo");
            Codigo[i]= leer.nextInt();
        }
        // Ciclo repetitivo que lee los resultados de los criterios (C)
        // de cada aspirante
        for(i = 1; i < m; i++){
            for(j = 1; j < k; j++){
                System.out.println("C["+i+"] ["+j+"] :");
                C[i][j]= leer.nextInt();
            }
        }
        // Ciclo de lectura del vector fila de ponderaci´on
        for(i = 1; i < k; i++){
            System.out.println("P");
            P[i]= leer.nextInt();
        }
        // C´alculos base para la selecci´on de personal por el m´etodo
        // de promedio simple
        for(i = 1;i<m;i++){
            Media[i] = 0;
            for(j = 1; j < k; j++){
                 Media[i] = Media[i] + C[50][50];
            }
            Media[i] = Media[i]/k;
        }
        // C´alculos base para la selecci´on de personal por la media ponderada
        // Ciclo que suma el vector fila de los valores ponderados
        int Sumap = 0;
        for(i = 1; i < k; i++){
            Sumap = Sumap + P[i];
        }
        for(i = 1;i<m;i++){
            Pond[i] = 0;
            for(j = 1;j<k;j++){
                Pond[i] = Pond[i] + C[i][j] + P[j];
            }
        }
    }
    
}
