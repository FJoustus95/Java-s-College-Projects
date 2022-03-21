
package EJERCICIOS_MATRICEZ;

    

public class EM02 {
    public static void main (String [] args) {


   int [] array = new int[10];
   
       
       for (int i = 0; i < array.length; i++) {
           int aleatorio= (int) (Math.random()*100);
           array[i]= aleatorio;
       }
       for (int j = 0; j < array.length; j++) {
           System.out.println("Numero"+ (j+1) + " " + array[j]);
           
       } int numeroMayor = array[0];
       for (int x = 0; x < array.length; x++) {
           if (array[x]> numeroMayor) {
               numeroMayor = array[x];
            
       }
   
      }System.out.println("El numero mayor es: " + numeroMayor);
      
          int contarNumeros = 0;
            for (int k = 0; k <array.length; k++) {
                    if (array[k]== numeroMayor) {
                        contarNumeros++;
                     }   
                 }
                    System.out.println("Se repite: " +contarNumeros + " veces ");
                    
       }
        
                    
                    }
       
              
              
              
              
              
              
        
                
            
              
              
              
              
      
      
      
      

    
    
        
       
        
    
         
             
         
            
        
    
   

