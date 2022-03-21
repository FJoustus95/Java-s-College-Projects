
package EJERCICIOS_MATRICEZ;

    import java.util.Scanner;


public class EM11 {
    public static void main(String [] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
            float[] notas = new float[6];
            String[] alumnos = new String[6];
            //Llenamos el vector con nombres
            for(int i=0;i<6;i++){
                System.out.println("Ingrese el nombre del alumno No. "+(i+1));
                String nombre = leer.nextLine();
                alumnos[i] = nombre;
            }
            //Llenamos el vector con las notas
            //como tenemos condiciones se usa el do while para llenar el vector
            int contador = 1;
            do {
                System.out.println("Ingrese la nota de "+alumnos[contador-1]+":");
                float numero = leer.nextFloat();
                if(numero>=0 && numero<=10){
                    notas[contador-1] = numero;
                    contador++;
                }
                else {
                    System.out.println("Inserte una nota valida");
                }
            }while(contador<7);
            //Escribimos los resultados
            for(int j=0;j<6;j++){
                System.out.println("\n");
                if (notas[j]>=0 && notas[j]<5){
                    System.out.println("Id del alumno: "+(j+1)+"\nNombre: "+alumnos[j]+"\nNota: "+notas[j]+"\nEstado: Suspendido");
                }
                else if(notas[j]>=5 && notas[j]<7){
                    System.out.println("Id del alumno: "+(j+1)+"\nNombre: "+alumnos[j]+"\nNota: "+notas[j]+"\nEstado: Bien");
                }
                else if(notas[j]>=7 && notas[j]<9){
                    System.out.println("Id del alumno: "+(j+1)+"\nNombre: "+alumnos[j]+"\nNota: "+notas[j]+"\nEstado: Notable");
                }
                else if(notas[j]>=9 && notas[j]<11){
                    System.out.println("Id del alumno: "+(j+1)+"\nNombre: "+alumnos[j]+"\nNota: "+notas[j]+"\nEstado: Sobresaliente");
                }
            }
            
    }

        
    }

