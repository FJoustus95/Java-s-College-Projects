
package POO;


public class Alumnos1 {
    int numeroAlumnos, carnet;
        String nombre, apellidos;
        //Creando el metodo constructor
        
        Alumnos1(int noAlumno, int carne, String name, String last_name){
            this.numeroAlumnos = noAlumno;
            this.carnet = carne;
            this.nombre = name;
            this.apellidos = last_name;
                  
      }
//Creando un metodo para imprimir datos
        void verDatos(){
            System.out.println("El alumno numero: " + numeroAlumnos + " con carnet: " + carnet + " Nombre: " + nombre + " y apellidos: " + apellidos);
            
            
        }
        int getnumerosAlumnos(){
            return this.numeroAlumnos;
            
        }
        int getcarnet() {
            return this.carnet;
            
        }
        String getnombre() {
            return this.nombre;
            
        }
        String getapellidos() {
            return this.apellidos;
            
        }
        void setnumerosAlumnos(int NA) {
            this.numeroAlumnos= NA;
            
        }
        void setcarnet(int identificacion) {
            this.carnet = identificacion;
            
        }
        void setnombre(String name) {
            this.nombre = name;
            
        }
        void setapellido(String ape) {
            this.apellidos = ape;
            
        }
}
