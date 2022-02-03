
package arreglos;
import java.util.Scanner;
/**
 *
 * @author ASUS TUF
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n , i;
        
        double suma, promed, mayor;
        suma=0; promed=0; mayor =0;
        
        System.out.println("Ingrese el numero de notas a promediar ");
        n = leer.nextInt();
        
        double[] Notas = new double[n];
        String[]Nombres = new String[n];
        for(i=0; i<n; i++){
            System.out.println("Ingrese la nota " +i+";");
            Notas[i] = leer.nextDouble();
            
        }
        for (i=0; i<n; i++){
            suma = suma + Notas[i];
            
        }
        promed = suma/(n-1);
        
        for (i=0; i<n; i++){
            System.out.println("Notas[ " +i +"] =" +Notas[i]);
        }
        System.out.println("\n");
        System.out.println("El promedio de Notas es: " +promed);
        
        mayor = Notas[0];
        for (i=1; i<n; i++){
            if(Notas[i]<mayor){
                mayor = Notas[i];
            }
            System.out.println("----" +mayor);
        }
        System.out.println("---La nota mayor es:  " +mayor);
        for (i=0; i<n; i++){
            if(1%2!=0){
                System.out.println("Notas["+i+"] =" +Notas[i]);
            }
        }
        System.out.println("Nombres de los estudiantes ");
     
        for(i=0;i<n;i++){
            System.out.println("Ingrese el nombre " +i+":");
            Nombres[i]=leer.next();
        }
        System.out.println("\n Notas y Nombres de estudiantes");
        for(i=0; i<n; i++){
            System.out.println(Nombres[i]+" tiene una nota de " +Notas[i]);
        }
    } 
}
