
import java.util.Scanner;

public class A1E02 {
  
    public static void main (String [] args) {
        
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese el Pais: ");
       
            String pais = leer.nextLine();
        
        System.out.println("Ingrese la Capital: ");
            
        String capital = leer.nextLine();
        
        System.out.println(capital + " es la capital de " 
        + pais);    
        
  
        
    }
}