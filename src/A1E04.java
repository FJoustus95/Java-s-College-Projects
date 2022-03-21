
import java.util.Scanner;

public class A1E04 {
  
    public static void main(String [] args) {
        
        
                
            Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int numero = leer.nextInt();
        
        int cuadrado = (int) Math.pow(numero, 2);
        int cubo = (int) Math.pow(numero, 3);
        
        System.out.println("El numero ingresado es " + numero + " su cuadrado es " + cuadrado+ " y su triple es " + cubo);
        
        
    }
}
