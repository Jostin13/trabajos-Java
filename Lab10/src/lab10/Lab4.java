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
public class Lab4 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        //numeros de elemntos de la lista
        System.out.println("La lista tiene: "+nombres.size()+"elemtos");
        //Agregar elemtos a la lsita
        nombres.add("Anita");
        nombres.add("kevin");
        nombres.add("Edgar");
        nombres.add("Diego");
        nombres.add("David");
        nombres.add("Bryan");
        nombres.add("Yo");
        System.out.println("La lista tiene: "+nombres.size()+ " elemtos");
        //retorna el elemento dentro de la lista
        System.out.println("Elemento en la posicion 0" +nombres.get(0));
        System.out.println("Elemento en la posicion 4" +nombres.get(4));
        System.out.println("Los elemntos de la lista son");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        System.out.println("\n");
        System.out.println("Los elemtos de la lista son: (for simplificado)");
        for(String name: nombres){
            System.out.println(name);
        }
    } 
}
