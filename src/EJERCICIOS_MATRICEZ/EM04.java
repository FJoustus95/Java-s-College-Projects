    
    
package EJERCICIOS_MATRICEZ;
    

public class EM04 {
    public static void main(String [] args) {
        
        
        int [] array = new int [10];
        
        //Genera los 10 numeros aleatorios
        for (int i = 0; i < array.length; i++) {
            int aleatorio =  (int) (Math.random()*100);
            array[i] =aleatorio;
            
        }
        
        //Buscamos el Numero mayor y recorremos el vector
           
            int numeroMayor= array[0];
            
           for(int j=0; j <array.length; j++ ) {
               if(array[j]>numeroMayor) {
                   numeroMayor = array[j];
                   
                   
               }
              }
                 //Se recorre la matriz y se imprime
        for (int k = 0; k < array.length; k++) {
            System.out.println("El numero " + (k+1) + " es " + array[k] + " Distancia hasta el numero mayor: " + distanciaNumeros(array[k], numeroMayor));  
           
        }  
              
    
    
    
               
    
    
    }
     
public static int distanciaNumeros( int numero, int mayor){
    int contando = 0;
        for (int i = numero; i < mayor; i++) {
        contando++;
    }
    return contando;
    }
}
    