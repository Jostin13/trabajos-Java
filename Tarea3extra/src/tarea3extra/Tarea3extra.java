/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3extra;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Tarea3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        // declaracion de variables 
        int dia, mes, año;
        dia =1; mes =1; año=1;
        //ingrese los datos 
        System.out.println("Insertar el día");
        dia =leer.nextInt();
        System.out.println("Insertar el mes");
        mes =leer.nextInt();
        System.out.println("Insertar el año");
        año =leer.nextInt();

        //proceso 
        if ((dia>=1) && (dia<=30)){
            if ((mes>=1) && (mes<=12)){
                if(año!= 0){
                    System.out.println("fecha correcta");
                }
                else{
                    System.out.println("la fecha es incorrecta, año");
                }
            }
            else{
                System.out.println("la fecha es incorrecta, mes");
            }
        }
        else{
            System.out.println("la fecha es incorrecta, dia");
        }       
    }

}
