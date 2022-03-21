
package EJERCICIOS_MATRICEZ;

import java.util.Scanner;


public class EM09 {
    public static void main(String [] args) {
        
        
Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa la dimension de las matrices: ");
            int dimension = leer.nextInt();
            //llamamos una funcion que llena las matrices
            int[][] matriz1 = llenarMatriz(dimension,1);
            int[][] matriz2 = llenarMatriz(dimension,2);
            //llamamos una funcion que suma las matrices
            int[][] matrizResultado = sumarMatrices(matriz1,matriz2,dimension);
            //Escribimos los resultados con una funcion que escriba las matrices
            System.out.println("La suma de: ");
            escribirMatriz(matriz1,dimension);
            System.out.println("Y");
            escribirMatriz(matriz2,dimension);
            System.out.println("Es:");
            escribirMatriz(matrizResultado,dimension);
        
        }
   
    public static int[][] llenarMatriz(int dimension,int numero){
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[dimension][dimension];
        for(int i=0;i<dimension;i++){
            for(int j=0;j<dimension;j++){
                System.out.println("Matriz No."+numero+" ingrese los datos de la posicion ["+(i+1)+"]["+(j+1)+"]");
                int dato = leer.nextInt();
                matriz[i][j]=dato;
            }
            }return matriz;
    }
    
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2,int dimension){
        int[][] matrizResultado = new int[dimension][dimension];
        for(int i=0;i<dimension;i++) {
            for (int j = 0; j < dimension; j++) {
                matrizResultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        return matrizResultado;
    }
    
    public static void escribirMatriz(int[][] matriz, int dimension){
        for(int i=0;i<dimension;i++) {
            for (int j = 0; j < dimension; j++){
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println();
        }
    }
        
        
        }
    
    
    

