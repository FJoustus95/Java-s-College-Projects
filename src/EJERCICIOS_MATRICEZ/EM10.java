
package EJERCICIOS_MATRICEZ;

    import java.util.Scanner;

public class EM10 {
    public static void main(String [] args) {
      
   
        Scanner leer = new Scanner(System.in);
        
        
            int[][] matriz = new int[3][4];
            int[][] matrizTranspuesta = new int[4][3];
            //Ingresamos los datos de la matriz
            for(int i=0;i<3;i++) {
                for (int j = 0; j <4; j++) {
                    System.out.println("Ingrese los datos de la posicion: ["+(i+1)+"]["+(j+1)+"]");
                    int numero = leer.nextInt();


                    matriz[i][j]=numero;
                    matrizTranspuesta[j][i]=numero;
                }
            }
            //escribimos los resultados
            System.out.println("La matriz transpuesta de");
            for(int i=0;i<3;i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("["+matriz[i][j]+"] ");
                }
                System.out.println();
            }
            System.out.println("ES");
            //Escribimos la matriz transpuesta
            for(int i2=0;i2<4;i2++) {
                for (int j2 = 0; j2 < 3; j2++) {
                    System.out.print("["+matrizTranspuesta[i2][j2]+"] ");
                }
                System.out.println();
            }
           
    }
        
        
    }
   
