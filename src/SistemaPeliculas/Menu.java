package SistemaPeliculas;
    
// Importando librerias externas de Java
import java.util.InputMismatchException;
    import java.util.Scanner;

//Clase secundaria para el menuPrincipal
public class Menu {
    
    boolean salir =false;
    
    
    Scanner leer = new Scanner(System.in);
    
  //Instanciacion que nos permite entrar a las funciones externas
    Peliculas peliculasDisponibles = new Peliculas();
     
    //Funcion que nos permite desarrollar el menu
    
    void menuPrincipal(){
        boolean salir = false;
        int opcion;
        
         //While para las opciones, ciclo del menu
        while(!salir) {
            System.out.println("Sistema de alquiler de peliculas");
            
            System.out.println();
            
            System.out.println("1) Ingreso de peliculas");
            System.out.println("2) Mostrar peliculas");
            System.out.println("3) Mostrar una pelicula en especifico");
            System.out.println("4) Ingreso de clientes ");
            System.out.println("5) Mostrar Clientes");
            System.out.println("6) Salir");
            
            // try para restringir las entradas solamente a numeros en el rango de 1 a 6
            try{
            System.out.println();
            
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
            
            System.out.println();
            
            //Ciclo del menu, por defecto se activa 1 vez
            switch(opcion) {
                
                case 1:
                   peliculasDisponibles.crearPelicula(); 
                    break;
                    
                case 2:
                   peliculasDisponibles.listarPeliculas();
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                   salir = true;
                   
                    System.out.println("Usted ha salido del sistema");
                    break;
                
                default:
                    System.out.println("Las opciones son entre 1 y 6");
                    
                    break;
                    
                    
            }
            
            //Complemente del try, excepciones
        } catch (InputMismatchException e) {
                System.out.println("Solo se pueden introducir numeros");
                    leer.next();
            
            
        }
           
        }
        
        
        

        
        
        
    }



}
