
package POO;


public class Alumnos {
    int numeroAlumnos, carnet;
        String nombre, apellidos;
        //Creando el metodo constructor
        
        Alumnos(int noAlumno, int carne, String name, String last_name){
            this.numeroAlumnos = noAlumno;
            this.carnet = carne;
            this.nombre = name;
            this.apellidos = last_name;
                  
      }
//Creando un metodo para imprimir datos
        void verDatos(){
            System.out.println("El alumno numero: " + numeroAlumnos + " con carnet: " + carnet + " Nombre: " + nombre + " y apellidos: " + apellidos);
            
            
        }

}
