
package Objetos;

import java.util.Scanner;

public class Cuadrado {
    
    Scanner leer = new Scanner(System.in); 
    int lado1;
    int lado2;
    int lado3;
    int lado4;
    
    Cuadrado (int lado1, int lado2, int lado3, int lado4) {
    
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
        
        
        
        
        
    }
    
    int calcularPerimetroCuadrado(int lado1, int lado2,int lado3, int lado4 )  {
        System.out.println("Calcular el perimetro de un cuadrado");
        lado1 = leer.nextInt();
        
        if ( lado1 > 0) {
            lado2 = lado1;
            lado3 = lado2;
            lado4 = lado3;
            
            System.out.println("Ingrese un lado del cuadrado");
            return (lado1+ lado2+ lado3 + lado4);
      
        } else {
            System.out.println("Usted no ingreso un numero correcto");
          
            
            
        }
        return 0;
        
        
    }
   int CalcularAreaCuadrado ( int ladoB, int ladoA) {
       
       System.out.println("Calcular area de un cuadrado");
       
       System.out.println("Ingrese la base de cuadrado");
       lado1 = leer.nextInt();
       ladoB = lado1;
       
       System.out.println("Ingrese la altura del cuadrado");
       lado2 = leer.nextInt();
       ladoA = lado2;
       
       return(ladoB * ladoA);
       
   } 
}
