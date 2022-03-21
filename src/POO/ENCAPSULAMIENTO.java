
package POO;


public class ENCAPSULAMIENTO {
    public static void main(String [] args ) {
        
        Alumnos_Encapsulamiento alu1 = new Alumnos_Encapsulamiento(10," ", " "," ");
        Alumnos_Encapsulamiento alu2 = new Alumnos_Encapsulamiento(10," ", " "," ");
       
        alu1.ingresarDatosAlumno();
        
        System.out.println();
        
        alu1.setnombre("Daniel");
        alu1.setapellidos("Lopez");
        alu1.setemail("gmail");
        alu1.setcarnetAlumno(202021903);
        
        alu1.verDatosAlumnos();
        
        
        
        
        
    }
    
}
