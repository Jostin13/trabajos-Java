/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4estructuraslógicasrepetitivas;

/**
 *
 * @author ASUS TUF
 */
public class SumaMultiplos3y5 {
    public static void main(String[] args) {
        //declaracion e inicializacion de variables
        int suma, i;
        suma =0; i =0;
        //proceso
        System.out.println("Suma de multiplos de 3 y 5");
        while (i<=999) {
            if((i%3 ==0)&&(i%5 ==0)){
                suma = suma+1;
            }
            i = i+1;
        }
        System.out.println("Respuesta: " +suma);
    }
    
}
