import java.util.Scanner;

public class A1E14 {
    public static void main(String [] args) {
        
        double numerador;
        double denominador;
        
    Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numerador");
        
            numerador = leer.nextDouble();
        
        System.out.println("Ingrese el denominador");
        
            denominador = leer.nextDouble();
            
            if (numerador % denominador ==0) {
                
                System.out.println("El numero es divisible");
            } else {
                
                System.out.println("El numero no es divisible");
            }
    }
}
