
import java.util.Scanner;

public class A1E09 {
    
    public static void main(String [] args) {
       
        
     Scanner cadena = new Scanner(System.in);
        
        System.out.println("Ingrese un texto");
        
            String A = cadena.nextLine();
        
        System.out.println("Ingrese otro texto");
    
            String B = cadena.nextLine();
            
        String palabra1 = A;
        String palabra2 = A.replace(A, B);
        
        String texto1 = B;
        String texto2 = B.replace(B, A);
    
    
            System.out.println("La primera palabra es: " + texto2 + " y la segunda palabra es: " + palabra2);
            
         }
        
        
        
    }

