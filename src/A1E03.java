
import java.util.Scanner;

public class A1E03 {
  
    public static void main(String [] args) {
        
        
                
            Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int numero = leer.nextInt();
        
        int cuadrado = (numero*2);
        int cubo = (numero*3);
        
        System.out.println("El numero ingresado es " + numero + " su doble es " + cuadrado+ " y su triple es " + cubo);
        
        
    }
}
