import java.util.Scanner;

public class A1E13 {

    public static void main(String [] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Calcular volumen de un cilindro");
        System.out.println("Ingrese el radio");
        
        double radio = leer.nextDouble();
        
        System.out.println("Ingrese la altura");
        
        double altura = leer.nextDouble();
        
        double volumen_cilindro = Math.PI*Math.pow(radio, 2)*altura;
        
      if (radio < 0) {
            System.out.println("Ingrese un numero positivo");
             
    } if (radio == 0) {
            System.out.println("Ingrese un numero mayor que cero");
           
    } if (radio > 0) {
            
            System.out.println("Ingrese la altura");
       
                if (altura < 0) {
                   System.out.println("Ingrese un numero positivo"); 
                    
                }if (altura ==0) {
                    System.out.println("Ingrese un numero mayor a 0");
                    
                    
                }if (altura > 0) {
                    System.out.println("El volumen del cilindro es: " + volumen_cilindro);
                    
                } 
            
    }else System.out.println("Ingrese un numero mayor que cero");
        
    }
    
}
