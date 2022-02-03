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
public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Generar un dia de la semana aleatoriamente");
        int dia =(int)(Math.random()*7)+1;
        System.out.println(dia);
        switch(dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default ->{
            }
        }
    }
}
