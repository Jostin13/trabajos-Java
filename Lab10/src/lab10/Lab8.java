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
public class Lab8 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(""));
            bw.write("Amarillo\n");
            bw.write("Azul\n");
            bw.write("rojo\n");
            bw.close();
        } catch (IOException ioe) {// No se a encontrado el archivo 
            System.out.println("No se encuentra el archivo ");
            
        }
        try{
            BufferedReader br = new BufferedReader (new FileReader ("/Users/ASUS TUF/Documents/MisDocumentos"
                + "/ECC/OCT20FEB21/IntProgramacion/colores.txt"));
            String linea = "";
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        }    
        catch(FileNotFoundException fnfe){ // no se encuentra el archivo
            System.out.println ("No se encuentra el archivo");
        }
        catch(IOException ioe){ //error en la lectura del archivo
            System.out.println ("No se puede leer el archivo");
        }
    }
}

