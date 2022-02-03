/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.*;
/**
 *
 * @author ASUS TUF
 */
public class Lab7 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ASUS TUF\\Documents\\Notas"));
            String linea = "";
            while (linea!= null) {
                System.out.println("Linea");
                linea = br.readLine();
            }
                    
            
        } catch (FileNotFoundException fnfe) {// No se a encontrado el archivo 
            System.out.println("No se encuentra el archivo ");
        }catch(IOException ioe){//error en la lectura del archivo 
            System.out.println("No se puede leer el archivo");
        }
    }
}
