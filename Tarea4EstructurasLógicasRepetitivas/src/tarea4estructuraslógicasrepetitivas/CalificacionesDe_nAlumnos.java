/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4estructuraslógicasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF
 */
public class CalificacionesDe_nAlumnos {
    public static void main (String [] args) {
        Scanner leer = new Scanner (System.in);
        //declaracion e inicialiazacion de variables
        int n, alum,aprob,reprob;
        double nota;
        n=0;alum=1;aprob=0;reprob=0; nota=0;
        //entrada de datos
        System.out.print("Numero de alumnos a calificar: ");
        n = leer.nextInt();
        do{
            System.out.println("Ingrese la nota del estudiante: ");
            nota = leer.nextDouble();
            if(nota<7){
                reprob=reprob+1;
                  
            }
            else{
                aprob=aprob+1;
            }
            alum=alum+1;
        
        }while(alum<=n);
        System.out.println("El numero de alumnos que aprobaron son: "+aprob);
        System.out.println("El numero de alumnos que reprobaron son: "+reprob);
        }
}

    