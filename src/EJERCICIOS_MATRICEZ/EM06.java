
package EJERCICIOS_MATRICEZ;


public class EM06 {
        public static void main(String [] args) {
            
            int [][] matriz = {{5,6,13},{12, 2, 4},{21, 7, 6}};
            
                int matriz_resultado[][] = new int [3][3]; 
            
                    System.out.println("El resultado de la matriz de: " );
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                System.out.print(matriz[i][j]+ " ");
                                if (i ==1 && j ==2) {
                                        System.out.print("  *2");      
                                }
                                
                            }
                                System.out.println();
                                
            }
            System.out.println(" es ");
            
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        matriz_resultado[k][l]= (matriz[k][l]*2);
                            System.out.print(matriz_resultado[k][l] + " ");
                            
                        
                    }
                    System.out.println();
            }
        }
}
