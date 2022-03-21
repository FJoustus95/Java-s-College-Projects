import java.util.Scanner;


public class A1E08 {
    
    public static void main(String [] args) {
        
        double promedio;
        
            Scanner escanear = new Scanner(System.in);
        
        System.out.println("Ingrese el numero 1");
        
            double numero1 = escanear.nextDouble();
        
        System.out.println("Ingrese el numero 2");
            
            double numero2 = escanear.nextDouble();
            
        System.out.println("Ingrese el numero 3");
        
            double numero3 = escanear.nextDouble();
            
            promedio = ((numero1+numero2+numero3)/3);
            
        System.out.println("El promedio de los 3 numeros ingresados es: " + promedio);
        
        
    }
    
}
