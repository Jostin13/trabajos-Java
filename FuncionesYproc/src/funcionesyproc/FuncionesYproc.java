/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesyproc;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class FuncionesYproc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        System.out.println("Procedimiento para verificar si un numero es "+ "par o impar");
        System.out.println("Ingrese el numero a verificar");
        num = leer.nextInt();
        ParImpar(num);
        System.out.println("Fin del procedimiento 1 ");
        NegPos(num);
        System.out.println("Fin del procedimiento 2");
    }
    //procedimiento para verificar si un numero es para o impar
    public static void ParImpar (int numero) {
        if(numero % 2 == 0){
            System.out.println("El numero " +numero +"es par \n");
        }
        else{
            System.out.println("El numero " +numero +"es impar \n");
        }
    }
    //procedimiento para verificar si un numero es positivo o negativo
    public static void NegPos(int numero) {
        if (numero > 0){
            System.out.println("El numero " +numero +"es positovo");
        }
        else{
            System.out.println("El numero " +numero +"es negativo");
        }
    }
}
