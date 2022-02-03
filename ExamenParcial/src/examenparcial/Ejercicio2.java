/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        // declaracion e inicializacion de variables
        int tipoCliente;
        double cantidadLibros, costoLibro, descuento, netoPagar, totalPagar;
        String nombreCliente;
        //ingreso de datos 
        System.out.print("ingresa el nombre del cliente:");
        nombreCliente = in.nextLine();
        System.out.print("ingresa el valor de cantidad de libros:");
        cantidadLibros = in.nextDouble();
        in.nextLine();
        System.out.print("ingresa el valor de costo del libro:");
        costoLibro = in.nextDouble();
        in.nextLine();
        netoPagar=cantidadLibros*costoLibro;
        descuento=0;
        
        //proceso
        System.out.println("selecciona el valor de tipo de cliente.");
        System.out.println("\t1.- docente");
        System.out.println("\t2.- estudiante");
        System.out.println("\t3.- otro");
        System.out.print("\t: ");
        
        tipoCliente = in.nextInt();
        in.nextLine();{
            
        if  (tipoCliente<1||tipoCliente>3);
        if(tipoCliente==1)
            descuento =netoPagar*0.30;
        if(tipoCliente ==2)
            descuento =netoPagar*0.20;
        if(tipoCliente ==3)
            descuento =netoPagar*0.10;
        if(cantidadLibros>5&&cantidadLibros<=10)
            descuento =descuento*0.04;
        if(cantidadLibros>10)
            descuento =descuento*0.08;
        totalPagar =netoPagar-descuento;
        
        //datos de salida
        System.out.println("Nombre del cliente:" + nombreCliente);
        System.out.println("Valor de descuento:" + descuento);
        System.out.println("Valor de neto a pagar:" + netoPagar);
        System.out.println("Valor de total a pagar:" + totalPagar);
    }
} 
}


