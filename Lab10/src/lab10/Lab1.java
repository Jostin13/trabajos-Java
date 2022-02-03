/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author ASUS TUF
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Generacion de 10 numeros aleatorios entre 0 y 1 -Decimales \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random());
        }
        System.out.println("Generacion de 10 numeros aleatorios entre 0 y 10 -Decimales \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.random()*10);
        }
        System.out.println("Generacion de 10 numeros aleatorios entre 0 y 10 - Enteros \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println((int)Math.random()*10);
        }
        System.out.println("Generacion de 10 numeros aleatorios entre 1 y 50 - Enteros \n");
        for (int i = 1; i <= 10; i++) {
            System.out.println((int)Math.random()*50);
            System.out.println(numR);
        }
    }   
}
