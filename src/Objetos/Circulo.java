
package Objetos;

import java.util.Scanner;


public class Circulo {
    Scanner leer = new Scanner(System.in); 
    int perimetro;
    int area;
    int radio;
    
    
    Circulo ( int radio) {
    
       
        this.radio = radio;
        
        
        
        
        
        
    }
    
    double calcularPerimetroCirculo( int radio )  {
            
            System.out.println("Calcular perimetro de un circulo");
            System.out.println("Escriba el radio");
            
            radio = leer.nextInt();
            
            if(radio > 0) {
                
                return (2 *(3.1415)* (radio));
                
                
                
        
     
      } else {
                System.out.println("Usted no ingreso un numero correcto");
                
            } 
           return 0; 
    }
      
     double calcularAreaCirculo (int radio) {
           
            System.out.println("Ingrese el radio del circulo");
             radio = leer.nextInt();
            if(radio > 0) {
                return ((3.1415)*(radio)*(radio));   
                
                
            } else {
                System.out.println("Usted no ingreso un numero correcto");
                
            }
             return 0;
        
}
   
}


