/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionparcial;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class EvaluacionParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo;
        int num = 0, pares = 0, negativos = 0, Primos = 0; 
        int div = 0;
        int arreglos[] = new int[10];
        System.out.println("Ingrese los numeros");
        num =leer.nextInt();
        
        System.out.println("llenar los arreglos: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite el numero: ");
            
            if (arreglos[1] % 2==0) {
                pares++;
            } 
        }
        int par[] = new int [pares];
        pares =0;
        
        for (int i = 0; i < 10; i++) {
            if (arreglos[i]%2==0) {
                par[pares]=arreglos[i];
                pares++;
            }
        }
        
        System.out.println("\narreglos pares: ");
        for (int i = 0; i < pares; i++) {
            System.out.println(par[i]+" - ");
        }
        System.out.println("");
       
        
        }
    
}
