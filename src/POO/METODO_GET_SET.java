
package POO;


public class METODO_GET_SET {
    public static void main(String [] args ) {
        
        Alumnos1 alumno1 = new Alumnos1(12, 2020, "Juan" , "Veliz");
        Alumnos1 alumno2 = new Alumnos1(23, 2021, "Ernesto", "Sanchez");
        
        alumno1.verDatos();
        alumno2.verDatos();
        
        //Llamando a los metodos get
        System.out.println("El nombre del alumno 1 es: " + alumno1.getnombre());
        // modificamos los datos con el metodo set
        
        alumno1.setnombre("Luis");
        alumno1.setnumerosAlumnos(18);
        alumno1.setcarnet(2022);
        alumno1.setapellido("Marin");
        // Llamamos a la funcion verDatos
        alumno1.verDatos();
        
    }
}
