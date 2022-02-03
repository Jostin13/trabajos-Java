/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclorepetitivo;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaración e inicializacion de variables 
        int base, pot, result;
        int i;
        base =0; pot =0; result =1; i=1;
        //Ingrese los datos 
        System.out.println("Ingrese la base: ");
        base = leer.nextInt();
        
        System.out.println("Ingrese la potencia: ");
        pot = leer.nextInt();
        
        while (i<=pot){
            result = result *base;
            i = i +1;
            System.out.println("La potencia es: " +result);
            
        }
    }
}