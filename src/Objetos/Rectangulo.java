
package Objetos;

import java.util.Scanner;


public class Rectangulo {
    Scanner leer = new Scanner(System.in); 
    int ancho;
    int largo;
   
    Rectangulo (int ancho, int largo ) {
    
        this.ancho = ancho;
        this.largo = largo;
       
      
        
    }
    
    int calcularPerimetroRectangulo(int ancho, int largo )  {
        
        System.out.println("Calcular perimetro de un rectangulo \n");
        System.out.println("Ingrese el ancho del rectangulo");
        ancho = leer.nextInt();
        
        System.out.println("Ingrese el largo del rectangulo");
        largo = leer.nextInt();
       
        if(ancho > 0 && largo > 0 && ancho < largo) {
            return (2*(ancho + largo));
        }
            
        else { if (ancho == largo) {
            
            
                
                System.out.println("El ancho y largo no pueden ser el mismo numero");
                
            }  
                
                
            
            
   
          
            
        }    
        return 0;
        }
        
        int CalcularAreaRectangulo ( int ancho, int largo) {
       
       System.out.println("Calcular area de un rectangulo");
       
       System.out.println("Ingrese el ancho del rectangulo");
       ancho = leer.nextInt();
      
       
       System.out.println("Ingrese el largo del cuadrado");
       largo = leer.nextInt();
       
       if(ancho >0 && largo > 0 && ancho< largo) {
            return (ancho * largo);
           
                   
                   
                   
                   }else{ if(ancho == largo) {
                       System.out.println("El ancho y el largo no pueden ser el mismo numero");
                   
                   } 
                      
                       
                   
           
           
     
       }
        return 0;
        } 
}
        
    
   


