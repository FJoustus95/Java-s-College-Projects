
package EJERCICIOS_MATRICEZ;


public class EM07 {
    public static void main (String [] args) {
        
       int matriz[][] = new int [4][3];
       
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 3; j++) {
                    
                    int aleatorio = (int) (Math.random()* 555);
                    matriz[i][j]= aleatorio;    
                } 
        }
        System.out.println("La matriz es:" );
        for (int k2 = 0; k2 < 4; k2++) {
            for (int l2 = 0; l2 < 3; l2++) {
                System.out.print(matriz[k2][l2]+ " ");
                
                
            }
            System.out.println();
            
        }
        int suma_filas =0;
        for (int fila = 0; fila < 4; fila++) {
            if ((fila+1)%2 ==0 ) {
                for (int columna = 0; columna < 3; columna++) {
                    suma_filas = suma_filas + matriz[fila][columna];
                    
                    
                }
                
                System.out.println("La suma de la fila: " + (fila+1)+ " es " + suma_filas);
                
                
            }
            
        }
        
    }
}
