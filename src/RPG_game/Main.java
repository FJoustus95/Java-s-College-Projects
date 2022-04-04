
package RPG_game;


public class Main {
    public static void main(String [] args) {
        
       GameLogic.imprimirTitulo("Prueba de juego RPG Occidental");
       GameLogic.anythingToContinued();
       GameLogic.limpiarConsola();
       int input = GameLogic.readInt("Ingrese 1, 2 o 3: ", 3);
        System.out.println("Elige  " + input);
        
        //empezar el juego
        
        GameLogic.Startgame();
        
    }
}
