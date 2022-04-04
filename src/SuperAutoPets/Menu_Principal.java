
package SuperAutoPets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu_Principal {
    
    boolean salir = false;
    
    Scanner leer = new Scanner(System.in);
    
    
    //funcion que nos permite crear el menu del juego
    void menuPrincipal() {
        salir = false;
        int opcion;
        
    //do while para las opciones del ciclo
    
    while(!salir) {
        System.out.println("---------------------");
        System.out.println("Juego Super Auto Pets");
        System.out.println("---------------------");
        
        System.out.println();
        System.out.println();
        
        System.out.println("1) Modo Arena");
        System.out.println("2) Modo Versus");
        System.out.println("3) Modo Creativo");
        System.out.println("4) Salir del Juego");
        
        // try exception e solo para restringir la entrada del menu
        try{
        
            System.out.println();
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();
            
            System.out.println();
            
            //ciclo del menu por defecto se activa 1 vez
            switch(opcion) {
                
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                
                case 4:
                    salir = true;
                    
                        System.out.println("Usted ha salido del Juego");
                
                default:
                    
                    System.out.println("Las opciones son de 1 a 4");
                    
                    break;
                }
            
            //funcion de excepciones del menu
            
            
        } catch (InputMismatchException e) {
            System.out.println("Solo se pueden introducir numeros  ");
            leer.nextInt();
            
            
        }
        
        
    }
        
    }
}
