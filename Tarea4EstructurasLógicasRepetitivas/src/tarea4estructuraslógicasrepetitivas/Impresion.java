/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4estructuraslógicasrepetitivas;
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Impresion {
    public static void main(String[]arg){
        Scanner leer = new Scanner(System.in);
        //declaracion e inicializacion de variables
        int i, j, n;
        i =1; n =0;
        //datos
        System.out.println(" Figura especial ");
        System.out.println(" Ingrese un numero ");
        n = leer.nextInt();
        while (i<=n) {
            for (j = 1; j <= i; j++) {
                System.out.println(" * ");
            }
            System.out.println("");
            i = i+1;
        } 
    }
}
