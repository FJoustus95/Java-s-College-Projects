
package SuperAutoPets.Animales;

    import java.util.Scanner;

public class GameLogicS {
    static Scanner leer = new Scanner(System.in);
    
    static Animales animales;
    public static boolean isRunning;
    
    //metodo que simula limpiar la consola
    
    public static void limpiarConsola(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
                 
        }    
    }
        
      //metodo que imprime un separador de longitud n veces
    
    public static void imprimirSeparador(int n) {
        for (int i = 0; i < n; i++) 
            System.out.print("-");
            
            System.out.println();  
    }
      //metodo para imprimir titulo
    public static void imprimirTitulo(String titulo) {
        
        imprimirSeparador(30);
        System.out.println(titulo);
        imprimirSeparador(30);
        
        
    }
      //metodo para continuar presionando cualquier tecla
    public static void anythingToContinue(){
        System.out.println("Ingrese cualquier cosa para continuar");
        leer.next();
        
        
    }
}