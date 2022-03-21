
package POO;

import java.util.Scanner;

public class Alumnos_Encapsulamiento {
    public int carnet_alumno ;
    public String email;
    public String  nombre, apellidos;
    
    Alumnos_Encapsulamiento ( int carnet_alumno, String email, String nombre, String ape){
        this.carnet_alumno = carnet_alumno;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = ape;
        
    }
        
    Scanner leer = new Scanner(System.in);
    
        void setcarnetAlumno(int CA){
            this.carnet_alumno = CA;
            
            
        }
        public double getcarnet_alumno(){
            return carnet_alumno;
       
       
   } 
        void setemail (String correo_electronico) {
            this.email = correo_electronico;
            
        }
        String getemail(){
            return email;
            
        }
        void setnombre(String name) {
            this.nombre = name;
        }
        String genombre() {
            return nombre;
            
        }
        void setapellidos(String last_name) {
           this.apellidos = last_name;

}
        String getapellidos() {
            return apellidos;
            
        }

        void ingresarDatosAlumno(){
            
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.nextLine();
            System.out.println("Ingrese el apellido del alumno");
            apellidos = leer.nextLine();
            System.out.println("Ingrese el carnet del alumno");
            carnet_alumno = leer.nextInt();
            System.out.println("Ingrese el correo electronico del alumno");
            email = leer.nextLine();
            
           
            
        }
        
        void verDatosAlumnos() {
            System.out.println("El nombre del alumno es: " + this.nombre);
            System.out.println("El apellido del alumno es: " + this.apellidos);
            System.out.println("El carnet del alumno es: " + this.carnet_alumno);
            System.out.println("El correo electronico del alumno es: " + email);
            
        
            
        }
        
        
        
}
