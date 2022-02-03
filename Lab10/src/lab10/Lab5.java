/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.util.ArrayList;
/**
 *
 * @author ASUS TUF
 */
public class Lab5 {
    public static void main(String[] args) {
        ArrayList<String> dias =new ArrayList<String>();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        dias.add("Domingo");
        
        System.out.println("Tamaño lista Dias: " +dias.size()+" elemntos \n");
        System.out.println("Dias de la semana");
        
        for (String dia: dias) {
            System.out.println(dia);
        }
        //Buscar y obtener un elemento de la lista
        
        if (dias.contains("Viernes")) {
            System.out.println("Es el quinto dia del mes");
        }
        else{
            System.out.println("No existe el elemto en la lista \n");
        }
        //Eliminar un elemento de la lista
        dias.remove("Martes");
        System.out.println("Lista dias despues de remover --Martes--");
        for (String dia: dias) {
            System.out.println(dia);
        }
        //tamaño de la lista
        System.out.println("Tamaño lista dias: " +dias.size() +" elemtos \n");
        dias.remove(5);
        System.out.println("Lista dias despues de remover el elemento de la posicion 5");
        for (String dia: dias) {
            System.out.println(dia);
        }
        //tamaño de la lista
        System.out.println("Tamaño lista dias: "+dias.size()+" elemtos \n");
        //modificar lista
        
        System.out.println("Modificar elementos de la posicion 3");
        dias.set(3, "Friday");
        for (String dia: dias) {
            System.out.println(dia);
        }
        //Agregar un elemento a la lista
        System.out.println("\n");
        System.out.println("Agregar un elemnto en la posicion 1");
        dias.add(1,"Martes");
        for (String dia: dias) {
            System.out.println(dia);
        }
        System.out.println("Tamaño lista dias: " +dias.size() +" elemtos \n");
    }
}
