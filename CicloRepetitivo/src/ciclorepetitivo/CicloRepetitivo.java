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
public class CicloRepetitivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        //declaracio e inicializacion de variables 
        int i, n, suma;
        i =1; n =1; suma =0;
        
        //ingrese el limite del ciclo 
        System.out.println("Ingrese el limite del ciclo");
        n = leer.nextInt();
        
        //proceso
        while(i <= n){
            suma = suma +1;
            System.out.println(i);
            i = i +1;
        }
        System.out.println("i es: " +1);
        System.out.println("la suma es: " +suma);
        
        i = n; suma = 0;
        while (i>= 1){
            System.out.println("suma: " +suma);
            suma = suma + i;
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("i es: " +1);
        System.out.println("la suma es: " +suma);
        
    }
    
}
