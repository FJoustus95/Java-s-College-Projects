
package EJERCICIOS_MATRICEZ;

import java.util.Scanner;

public class EM05 {
    public static void main(String [] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de los alumnos: ");
        int alumnos = leer.nextInt();
        
            if(alumnos > 0 && alumnos <= 100 ) {
                int  matriz[] = array(alumnos);
                
                for (int i = 0; i < alumnos; i++) {
                    System.out.println("Ingrese la nota del alumno:  " + (i+1));
                    int nota = leer.nextInt();
                    
                    matriz[i]= nota;
                }
                
            }
        
        System.out.println("La nota media es de: " +nota_media(alumnos, matriz));

           
            }
        public  static int [] array(int alumnos) {
            int matriz[] = new int [alumnos +1 ];
            matriz [alumnos]= -51;
                return matriz;
     
 }
        public static float nota_media(int alumnos, int [] matriz){
        float suma =0;
        for (int i = 0; i < alumnos; i++) {
            suma = suma + matriz[i];
        
    }
        return (suma/alumnos);
    
}


}
