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
public class Secuencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables 
        double n, num, den, term, suma;
        int i;
        n =0; 
        i =1; 
        suma =0;
        num =1; den =2; term =0;
        
        //preceso
        while (i <=n);
        term =num/den;
        suma =suma+ num/den;
        System.out.println("El termino" +i +"es: "+num +"/" +den);
        
        suma =suma+term;
        num =num+2;
        den =den+3;
        i = i+1;
        
    }
}