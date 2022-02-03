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
public class Lab6 {
    public static void main(String[] args) {
        try {
            
            String ruta =" /Users\\ASUS TUF\\Documents\\NetBeansProjects\\Lab10\\src\\lab10";
            String contenido = "Archivo de prueba";
            File file = new File(ruta);
            //si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }
}
