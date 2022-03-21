
package Objetos;


public class Libro {
    
    String libro1, libro2, libro3, nombre1, apellido1; 
    String oraciones, frases, resumen, conclusiones;
    
    Libro(String book1, String name, String last_name, String summary) {
     this.libro1 = book1;
     this.nombre1 = name;
     this.apellido1 = last_name;
     this.resumen = summary;
        
        
    }
    Libro (String sentence, String phrases, String conclusions ) {
     this.oraciones = sentence;
     this.frases = phrases;
     this.conclusiones = conclusions;   
    }
    //creando un metodo para imprimir

   
    
    
    void prestamos(){
        
        System.out.println("Se presto un cuento de navidad en la biblioteca");
        
        
    }
    void devoluciones(){
   
        System.out.println("Se regreso el libro de ecuaciones diferenciales de denis zill 10th edition");
        
        
        
    }
    
    void mostrarInformacion() {
        System.out.println("El estudiante: " + nombre1 + " con apellidos " + apellido1 + " presto el libro " + libro1 + " para hacer un " + resumen ) ;
        
        
    }
    public String getnombre () {
        return this.nombre1;
        
        
    }
    public String getapellidos() {
        return this.apellido1;
        
    }
    public String getlibro1() {
        return this.libro1;
        
    }
    void setnombre(String nom) {
         this.nombre1 = nom;
        
    }
    void setapellido1 (String ape) {
        this.apellido1 = ape;
    }
    void setlibro1 (String book) {
        this.libro1 =  book;
    }
    void setresumen(String summary) {
        this.resumen = summary;
        
        
    }
}

