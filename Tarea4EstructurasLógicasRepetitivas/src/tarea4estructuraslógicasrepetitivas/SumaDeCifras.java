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
public class SumaDeCifras {
    public static void main(String[]arg){
        Scanner leer = new Scanner(System.in);
        //declaracion e inicialiazacion de variables
        int sdn, nd, n, cn;
        sdn=0; nd=0;
        //datos
        System.out.println("Numeros de cifras y la suma de las mismas");
        System.out.println("Por favor, digite un numero: ");
        n = leer.nextInt(); 
        cn = n;
        if (cn<0) {
            cn=-cn;          
        }
        if (cn==0) {
            //si el numero es 0, entonces n tiene 1 digito
            //y la suma de sus cifras es cero
            sdn=0;
            nd=0;
        }
        else{
            do{
                //se acumula la suma de las cifras
                sdn = sdn + (cn%10);
                nd = nd +1;
                //se descarta la cifra sumada
                cn = cn/10;
            }while (cn>0);
        }
        System.out.println(n+ " tiene " +nd+"digitos y la suma de los digitos de " +n+"es: ");
    }
}
