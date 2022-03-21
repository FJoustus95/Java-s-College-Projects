import java.util.Scanner;

public class E1Y2 {
    
    
     Scanner leer = new Scanner(System.in);    
   
     
     
     public static void main (String [] args ) {
        
        
   
        
        
          
        
        
    }
    
    
    
    
    
    public void tarea1(){
        int[] vector = new int[5];
        boolean salir = false;
        do{
            //for que agrega numeros
            System.out.println("Ingrese 5 numeros:");
            for(int i=0;i<vector.length;i++){
                System.out.println("Ingrese el numero "+(i+1));
                int numero = leer.nextInt();
                vector[i] = numero;
            }
            //for que muestra los numeros
            System.out.println("Los numeros que usted agrego al array son: ");
            for (int j=0; j<vector.length;j++){
                System.out.println("No."+(i+1)+"    "+vector[j]);
            }
            //Preguntamos al usario si quiere volver a realizar el ejercicio
            System.out.println("Menu Tarea 1\nDesea repetir?\n1.Si\2.No");
            int op = leer.nextInt();
            if (op == 2){
                salir = true;
            }
        }while(!salir);
    }
    public void tarea2(){
        int[] vector = new int[10];
        boolean salir = false;
        do{
            //Llenamos el vector con numeros random
            for (int i=0; i< vector.length;i++){
                int random = (int) (Math.random() *100);
                vector[i] = random;
            }
            //Mostramos el vector con los numeros
            for (int j=0;j< vector.length;j++){
                System.out.println("No. "+(j+1)+"    "+vector[j]);
            }
            //Checamos cual es el mayor
            //primero recorremos el vector y comparamos
            int mayor=vector[0];
            for (int k=0;k< vector.length;k++){
                if (vector[k]>mayor){
                    mayor = vector[k];
                }
            }
            //Luego escribimos los resultados
            System.out.println("El numero mas grande dentro del vector es: "+mayor);
            //Comprobamos las veces que se repite
            int contador=0;
            for (int l=0;l<vector.length;l++){
                if (vector[l] == mayor){
                    contador++;
                }
            }
            System.out.println("Y se repitio: "+contador+" veces");
            System.out.println("Menu Tarea 2\nDesea repetir?\n1.Si\2.No");
            int op = leer.nextInt();
            if (op == 2){
                salir = true;
            }
        }while(!salir);

    }
}



