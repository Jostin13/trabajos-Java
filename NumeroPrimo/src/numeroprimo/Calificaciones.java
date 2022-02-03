/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Calificaciones {
    public static void main(String[] args) { 
        Scanner leer = new Scanner (System.in);
        //declaracion e inicializacion de variables 
        double calificacion =0;
        do{
        System.out.println("Ingrese la calificación");
        calificacion = leer.nextInt();
        
        //datos 
        System.out.println ("calificacion es " +calificacion);
        } while (calificacion >= 0 && calificacion <= 100) ;
            System.out.println ("calificacion no es valida \n");
        }
}
        
     
    

