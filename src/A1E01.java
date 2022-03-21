import java.util.Scanner;

public class A1E01 {
    private static final Scanner SCANNER = new Scanner (System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    
        int num, num2,suma;
        
       
        System.out.println("por favor introduzca un numero entero");
        num = SCANNER.nextInt(); 

        System.out.println("por favor introduzca otro número entero");

        num2 = SCANNER.nextInt();

        suma = num + num2; 
        
        System.out.println("El valor de la suma es: " +suma);
       
    
    
    
    }

}
