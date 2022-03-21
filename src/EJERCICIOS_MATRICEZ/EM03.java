
    
package EJERCICIOS_MATRICEZ;

   import java.util.Scanner;


public class EM03 {
        public static void main(String [] args) {
          
         Scanner leer = new Scanner(System.in);
          
            int numeros[]= new int [7];
         
         
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Ingrese 7 numeros, numero ingresado " + (i+1) + " es " );
                
                numeros[i]= leer.nextInt();
              
               
            }
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("El numero " + (i+1) + " es " + numeros[i]);
                
                   
                
            
             
                
                
            }
             System.out.println("Ingrese un numero para buscar : \n");
             
              int numeroIngresado= leer.nextInt();
         
         int posicionElementoBuscado = buscarNumero(numeros,   numeroIngresado );  
          if (posicionElementoBuscado== 0)  {
              
                System.out.println("El numero es verdadero");
                
              
          }    else {
              
              System.out.println("El numero es falso");
          }
                
            }
             
        
     
        public static int buscarNumero(int []array, int buscar ) {
                 for (int i = 0; i < array.length; i++) {
                     if (array[i]== buscar) {
                         return i;
                          
                     } 
                         
                     }
                 
             
                 return -1;
             
             }  
        
    
    
}
        
        
                
            
        
        
        
        

