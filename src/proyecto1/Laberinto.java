

import java.util.Random;
import java.util.Scanner;
 public class juegoDeLaberinto{
    public static void main( String [] args) {
        
        
         Scanner leer = new Scanner(System.in);
         Random aleatorio = new Random();
        
            
        
        
            
                        
             String laberinto [][] = new String [30][30];
        // rellenando la matriz
        
            for(int i = 0; i<5; i++) {
                for(int j = 0; j< 5; j++) {
                 if (i==0 || i==29) {
                     laberinto[i][j]="|";
         
                 } 
                 else if(j==0 || j==4) {
                     laberinto[i][j]=1;
                     
                 }
                 else {
                     
                     laberinto[i][j]=0;
                 }  
                    
              
                
             }   
                
                
                    
          } 
             
                System.out.print("Inicializando mapa: \n");
                for (int i=0; i<5; i++){
                    for (int j=0; j<5; j++) {
                        
                        
                    }
                    System.out.println("");
                    
                    
                       }  
                         
                {
                }
              int opcion_menu=0;
            
          while ( opcion_menu !=5) {
              
                System.out.println("------------------------");
                System.out.println("  JUEGO DE LABERINTO"    );
                System.out.println("------------------------");
                
                System.out.println("1) Jugar ");
                System.out.println("2) Crear Mapa");
                System.out.println("3) Reportes");
                System.out.println("4) Visualizar Mapa");
                System.out.println("5) Salir del Juego");
                
                opcion_menu = solicitarOpcion("Elija una opcion: " ,1,5);
                
                
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
      
        /* System.out.println("Seleccione el laberinto en el que desea mostrar");
        System.out.println("1-2-3-4-5");
        opcionLaberinto = leer.nextInt();
        mostrarlaberintoX(laberinto);
        System.out.println(player.getOro());*/
    }

    public static void crearMapa(){
        /*System.out.println("Seleccione el laberinto que desea mostrar");
        System.out.println("1-2-3-4-5");
        opcionLaberinto = leer.nextInt();
        Laberinto[opcionLaberinto].mostrar();*/
    }


    public void crearlaberintos(){
        Laberinto laberintodefault = new Laberinto("Default");
        listadoLaberintos[0]=laberintodefault;
        mostrarMapas();

        System.out.println("Ingrese el nombre del nuevo laberinto");
        nombreLaberinto = leerS.nextLine();
        Laberinto laberintoaux = new Laberinto(nombreLaberinto);
        listadoLaberintos[laberintosCreados] = laberintoaux;
        laberintosCreados++;

    }


    public void reportes(){

    }

    public void mostrarMapas(){
        System.out.println("Bienvenido a la creacion de mapas\nRecuerda que solo puedes crear 5 mapas");
        System.out.println("Recuerda que los mapas se van agregando segun los vayas creando");
        System.out.println("Por el momento los mapas que tienes son:");
        for (int i=0;i<laberintosCreados;i++){
            System.out.println(i+". "+listadoLaberintos[i].getNombre());
        }
        System.out.println("Para continuar presiona cualquier tecla para continuar");
    }
}


}
public static void Escenario1(){
        Scanner lector = new Scanner(System.in);
        
        
        String[][] matriz1 = {
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", " ", " ", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", " ", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "*", " ", " ", "a", "a", " ", " ", " ", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", "a", "a", " ", " ", " ", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", " ", " ", " ", " ", "a", " ", " ", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", " ", "x", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "|"},
            {"|", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}};
        
        
         for (String[] matriz11 : matriz1) {
             for (int j = 0; j < matriz1[0].length; j++) {
                 System.out.print(matriz11[j] + "  ");
             }
             System.out.println();
         }
         
         
    }