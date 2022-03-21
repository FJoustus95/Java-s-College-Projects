
import java.util.Scanner;


public class A1E12 {
    
    public static void main(String [] args) {
        
        double fahrenheit;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la temperatura en celsius");
        
            Double celsius = leer.nextDouble();
            
            System.out.println("Se convirtio a grados Fahrenheit\n");
            
             fahrenheit = (9*celsius/5) + 32;
                
            System.out.println("El resultado de celsius a fahrenheit es: " + fahrenheit);
            
            
                
                
        
        
    }
}
