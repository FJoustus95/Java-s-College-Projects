
package POO;
import java.util.Scanner;

public class Operaciones {
    int x, y;
    int r;
    
    Scanner leer = new Scanner(System.in);
    
    int suma (int x, int y) {
        System.out.println("Operacion de suma");
        System.out.println("Ingrese el primer numero: ");
        int numero1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = leer.nextInt();
        
        return(numero1 + numero2);
    }

        int resta (int x, int y) {
            System.out.println("Operacion de resta");
            System.out.println("Ingrese el prime numero");
            int numero1 = leer.nextInt();
            
            System.out.println("Ingrese el segundo numero");
            int numero2 = leer.nextInt();
            
            return(numero1 - numero2);
        }

        double areaCirculo (int radio) {
           
            System.out.println("Ingrese el radio del circulo");
             radio = leer.nextInt();
            
             return ((3.1415)*(radio)*(radio));
             
              
        }
        
        boolean estado(int copas) {
            boolean e = false;
             if(copas >= 10) {
                 e = true;
                 
             } else{
                 e= false;
             }
            return e;
            
        }

}
