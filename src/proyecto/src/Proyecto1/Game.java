package proyecto.src.Proyecto1;
import java.util.Scanner;
public class Game{
    Texto textoJuego = new Texto();
    Scanner leer = new Scanner(System.in);
    boolean salir = false;
    public void play(){
        do {
            textoJuego.bienvenido();
            textoJuego.titulo();
            textoJuego.menu();
            int op = leer.nextInt();
            switch (op) {
                case 1:
                    Arena arena = new Arena();
                    boolean victoria = false;
                    do{
                        arena.play();
                        if (arena.getPlayer().getVictorias()==10){
                            victoria = true;
                        }
                    }while(!victoria);
                    break;
                case 2:
                    Versus versus = new Versus();
                    versus.play();
                    break;
                case 3:
                    Creativo creativo = new Creativo();
                    creativo.play();
                    break;
                case 4:
                    salir = true;
                    break;
            }
        }while(!salir);
    }
}
