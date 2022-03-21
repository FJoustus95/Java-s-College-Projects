import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {
        
            Scanner leer = new Scanner(System.in);
            
     System.out.println("Ingrese el numero de alumnos: ");
            int alumnos = leer.nextInt();
            if(alumnos>0 && alumnos <101){
               
                int []vector = arreglo(alumnos);
                //llenamos el arreglo de notas
                for(int i=0;i<alumnos;i++){
                    System.out.println("Ingrese la nota del alumno No. "+(i+1));
                    int nota = leer.nextInt();
                    vector[i] = nota;
                }
                
            }
            //calcular la media
                System.out.println("La media de las notas es de: "+calcularMedia(alumnos,));
            {
                System.out.println("El numero de alumnos no esta comprendido entre 1 y 100, vuelva a intentarlo");
            }
            
            
        }
    
    //Funcion que inicia el vector
    public static int[] arreglo(int alumnos){
        int[]vector = new int[alumnos+1];
        vector[alumnos]=-51;
        return vector;
    }
    //Funcion que calcula el valor medio
    public float calcularMedia(int alumnos, int[] vector){
       float suma=0;
       for (int i=0;i<alumnos;i++){
           suma = suma + vector[i];
       }
        return (suma/alumnos);
    }   
        
        }
        
