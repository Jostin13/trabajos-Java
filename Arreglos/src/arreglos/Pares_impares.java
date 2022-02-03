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
public class Pares_impares {
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int numeros, arreglo;
        int pares = 0, impares = 0;
        int arreglos[] = new int[10];
        System.out.println("Ingrese los numeros");
        arreglo =leer.nextInt();
        
        System.out.println("llenar los arreglos: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". Digite el numero: ");
            
            if (arreglos[1] % 2==0) {
                pares++;
            }
            else{
                impares++;
            }
        }
        int par[] = new int [pares];
        int impar[] = new int[impares];
        pares =0;
        impares =0;
        for (int i = 0; i < 10; i++) {
            if (arreglos[i]%2==0) {
                par[pares]=arreglos[i];
                pares++;
            }
            else{
                impar[impares] =arreglos[i];
                impares++;
            }
        }
        
        System.out.println("\narreglos pares: ");
        for (int i = 0; i < pares; i++) {
            System.out.println(par[i]+" - ");
        }
        System.out.println("");
        System.out.println("\narreglos impares: ");
        for (int i = 0; i < impares; i++) {
            System.out.println(impar[i]+" - ");
        }
        
    }           

    
}
