
import java.util.Scanner;

public class A1E10 {
    
    public static void main(String [] args) {
       
    double base_rectangulo; 
    double altura_rectangulo;        
    double perimetro_rectangulo;   
    double area_rectangulo;
    
    
            System.out.println("Medidas de un rectangulo");

            
                Scanner leer = new Scanner(System.in);
     
    
        System.out.println("Ingrese la base del rectangulo");
    
             base_rectangulo = leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        
             altura_rectangulo = leer.nextDouble();
            
        perimetro_rectangulo = 2*(base_rectangulo + altura_rectangulo);
        area_rectangulo = (base_rectangulo * altura_rectangulo);
        
        System.out.println("El area del rectangulo es: " + area_rectangulo + " y su perimetro es: " + perimetro_rectangulo);
        
        
    }
}
