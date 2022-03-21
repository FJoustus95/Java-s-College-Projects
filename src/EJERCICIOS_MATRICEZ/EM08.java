
package EJERCICIOS_MATRICEZ;
    import java.util.Scanner;

public class EM08 {
    public static void main (String [] args) {
        
        Scanner leer = new Scanner(System.in);
        String array1 [] = new String [5];
        String array2 [] = new String [5];
        
            System.out.println("Ingrese 5 palabras para la primera lista");
            for (int i = 0; i < array1.length; i++) {
                System.out.println("");
                    System.out.println("La palabra numero " + (i+1));
                    
             String palabra = leer.nextLine();
             array1[i] = palabra;
             
        }
            System.out.println("Ingrese 5 palabras para la segunda lista");
            for (int j = 0; j < array2.length; j++) {
                System.out.println("");
                    System.out.println("La palabra numero " + (j+1));
        
            String palabra2 = leer.nextLine();
            array2[j] = palabra2;
        }
        escribir(array1, 1);
        escribir(array2, 2);
          
        if(array1[0].equals(array2[0])){
                System.out.println("Cantidad de letras en el string del primer vector: "+array1.length);
                System.out.println("Cantidad de letras en el string del segundo vector: "+array2.length);
                System.out.println("Ambas estan en la posicion 0");
            
            System.out.println("Las palabras en la posicion 0 son iguales"); 
        } else {
            System.out.println("Cantidad de letras en el string del primer vector: "+array1.length);
            System.out.println("Cantidad de letras en el string del segundo vector: "+array2.length);
            System.out.println("Ambas estan en la posicion 0");
            
            System.out.println("Ambas palabras en 0 no son iguales");
            System.out.println("error");
               
        }
    }
    
    public  static void escribir (String [] texto, int numero) {
        System.out.println("Cadena numero " + numero);
        for (int i = 0; i < texto.length; i++) {
            System.out.println(texto[i] + ", ");
         
           
            
        }
        
        System.out.println();
    }
}
