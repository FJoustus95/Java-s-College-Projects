


import java.util.Scanner;
import java.util.Random;




public class Laberinto2 {

 public static Scanner scanner;
   
 //Variables globales 
    String laberinto [][] = new String [30][30];
    Scanner leer = new Scanner(System.in);
    Random aleatorio = new Random();
  
    //Reportes 
    
    static int registro_mapas =1;
    static int gold_player=0;
    static int get_gold = 0;
    
    
   public static void main(String [] args) {
        
          scanner = new Scanner(System.in);
        
         
         int opcion_menu= 0;
            
          while ( opcion_menu !=5) {
              
                System.out.println("------------------------");
                System.out.println("  JUEGO DE LABERINTO"    );
                System.out.println("------------------------");
                
                System.out.println("1) Jugar ");
                System.out.println("2) Crear Mapa");
                System.out.println("3) Reportes");
                System.out.println("4) Visualizar Mapa");
                System.out.println("5) Salir del Juego");
                
                opcion_menu = pedir_numero("Elija una opcion: " ,1,5);
                
                
                if(opcion_menu ==1) {
                        entrarAlJuego();
                                
                                     
                }if (opcion_menu ==2) {
                        crearMapa();
                    
                }if (opcion_menu == 3) {
                        verReportes();
                    
                }if (opcion_menu == 4) {
                        verMapa();
                    
                }if (opcion_menu == 5) {
                        System.out.println("Saliendo del Juego");
                        Runtime.getRuntime().exit(0);
                    
                }
              
         
             
         }
             
                    
              
          }  
     
             
               
                
               
                     
                public static void entrarAlJuego(){
        Scanner leer = new Scanner(System.in);
        
        
        String[][] matriz1 = {
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "S", "#", "#", "#", "#", "#", "S", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "S", "|"},
            {"|", "#", " ", " ", " ", " ", " ", " ", "#", "#", " ", " ", " ", " ", " ", " ", " ", "-", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "#", "#", "#", "#", "#", " ", " ", " ", "#", "#", " ", " ", " ", "#", "#", "#", " ", " ", "#", " ", " ", " ", "#", " ", " ", " ", " ", " ", "|"},
            {"|", "#", "G", " ", " ", "G", "#", " ", "#", " ", " ", "#", " ", "#", "#", "#", " ", "#", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", " ", " ", "|"},
            {"|", "#", " ", "#", "#", " ", "#", " ", "G", " ", "G", "#", " ", "#", " ", " ", " ", "#", " ", " ", " ", " ", " ", "#", "#", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", "#", " ", "J", "#", " ", "#", "#", "#", "#", "#", "#", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", "#", "#", " ", " ", "#", " ", "|"},
            {"|", "#", " ", "#", "#", " ", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", "#", " ", "#", " ", " ", "#", "G", "#", " ", "#", "#", "|"},
            {"|", "#", "#", " ", " ", " ", "#", " ", "#", " ", "#", " ", " ", " ", " ", "G", "#", " ", "#", "#", " ", "#", "#", "#", "#", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", "#", "#", "#", "#", "#", " ", "#", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", "#", "#", " ", "#", "#", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", " ", "#", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "G", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", " ", "#", " ", "#", "#", "#", "#", " ", "|"},
            {"|", "#", "#", "#", " ", "#", " ", " ", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", " ", "#", "#", "#", " ", " ", "#", " ", "#", " ", "#", " ", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", "#", " ", "|"},
            {"|", "#", "#", " ", "#", "#", " ", "#", " ", " ", "#", " ", "#", " ", " ", " ", "#", " ", "#", "#", "#", "#", " ", "#", " ", "#", " ", " ", "#", " ", "|"},
            {"|", "#", "G", " ", "#", " ", " ", "#", " ", "#", "#", "G", "#", " ", " ", " ", " ", " ", "#", " ", " ", "#", " ", " ", "#", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "#", " ", "#", "#", " ", " ", " ", " ", "#", " ", "#", " ", "a", " ", " ", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", " ", " ", "#", " ", " ", "#", " ", "#", "#", " ", " ", " ", "a", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", "|"},
            {"|", "#", "#", " ", " ", " ", "#", "#", "#", " ", "#", " ", " ", "#", "a", " ", " ", " ", "#", " ", " ", "#", " ", " ", " ", " ", " ", "#", "#", " ", "|"},
            {"|", "#", " ", "#", " ", "#", " ", " ", " ", " ", "#", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", " ", " ", " ", " ", " ", "|"},
            {"|", "#", " ", "#", " ", " ", " ", "#", "#", "G", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", "#", " ", "#", " ", " ", "|"},
            {"|", "#", " ", "#", "#", "#", "#", "#", " ", " ", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", " ", " ", "#", " ", "#", "#", "#", "|"},
            {"|", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", "G", "#", " ", " ", " ", " ", "|"},
            {"|", "#", " ", " ", " ", "#", " ", "#", " ", " ", " ", "#", "#", "#", "#", "#", "#", "G", "#", "#", "#", " ", " ", " ", " ", "#", " ", "#", "#", "#", "|"},
            {"|", "#", "#", "#", "#", "#", " ", "#", " ", "#", " ", "#", " ", " ", " ", " ", "#", " ", " ", " ", "#", " ", "#", "#", "#", "#", " ", "#", "-", "S", "|"},
            {"|", "#", " ", "#", " ", " ", " ", "#", " ", "#", " ", "#", "#", "#", "#", " ", "#", "#", "#", " ", "#", " ", "G", " ", " ", "#", " ", " ", " ", " ", "|"},
            {"|", "#", " ", "#", "#", "#", " ", "#", "#", "#", " ", "#", "G", " ", " ", "#", "#", " ", "#", " ", "#", "#", "#", "-", "#", " ", "#", "#", "#", " ", "S"},
            {"|", "#", " ", "#", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", " ", "#", " ", "#", " ", "-", "-", "-", "-", "#", " ", "#", " ", " ", " ", "|"},
            {"|", "#", "G", "#", "#", "#", "#", "#", "#", "#", "#", " ", "#", " ", "#", "#", "#", " ", "#", " ", "#", "#", "#", "#", "#", " ", "-", " ", " ", "#", "|"},
            {"|", "#", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", "#", " ", "S", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "#", " ", " ", " ", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        
        
         for (String[] matriz11 : matriz1) {
             for (int j = 0; j < matriz1[0].length; j++) {
                 System.out.print(matriz11[j] + "  ");
             }
             System.out.println();
         }
         
         
    }
            
                   
                        
 public static int pedir_numero(String mensaje, int min, int max) {
        int numeroIngresado = 0;
        boolean error_numero_ingresado = false;
        do {
            try {

                System.out.println("\n" + mensaje);
                numeroIngresado = scanner.nextInt();
                if ((numeroIngresado >= min) && (numeroIngresado <= max)) {
                    error_numero_ingresado = false;
                } else {
                    error_numero_ingresado = true;
                    System.out.println(
                            "Ingrese un numero entre [" + min + " . . " + max + "]");
                    System.out.println("Ingrese de nuevo.");
                }
            } catch (Exception e) {
                error_numero_ingresado = true;
                System.out.println(
                        "Ingrese un numero entre [" + min + " . . " + max + "]");
                System.out.println("Ingrese un numero entero.");

            }
            scanner.nextLine();
        } while (error_numero_ingresado);
        return numeroIngresado;
    }

 public static void crearMapa(){
     
     
     
     
     
 }
    public static void verReportes(){
        
        
        
        
    } 
    
    public static void verMapa() {
        
        
        
        
    }
   }               
            
        
        
        
        
       
                


   


       
                    
           