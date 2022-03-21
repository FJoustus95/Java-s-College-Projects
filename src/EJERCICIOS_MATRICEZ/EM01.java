
package EJERCICIOS_MATRICEZ;


    import java.util.Scanner;

public class EM01 {
    public static void main(String [] args) {
        
        Scanner leer = new Scanner(System.in) ;
        
        
       int [] numeros;
       numeros = new  int[5];
            
            for( int i = 0; i< numeros.length; i++) {
                
                
                System.out.println("Ingrese 5 numeros " + (i +1) + " : " );
                numeros[i] = leer.nextInt();
                
                
            }
            
                    
              for(int i = 0; i < numeros.length; i++ ) {
                  
                  System.out.println("El numero ingresado "+(i+1)+ " es: " + numeros[i] );
                  
              }
              
              
    
    
    }
}
