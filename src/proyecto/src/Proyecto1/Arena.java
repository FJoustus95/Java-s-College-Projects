package proyecto.src.Proyecto1;
import java.util.Scanner;
import proyecto.src.Mascotas.Mascota;
public class Arena {
    Scanner leer = new Scanner(System.in);
    Texto textoArena = new Texto();
    Jugador player = new Jugador(0,0,1,1,0);
    Mascota[] mascotasplayer = new Mascota[10];
    Tienda tiendaArena = new Tienda();
    boolean aptoRonda = false;
    public void play(){
        player.setOro(player.getOro()+10);
        do{
        textoArena.tituloArena();
        System.out.println("                 Ronda: "+player.getRonda());
        textoArena.opcionesRonda();
        int opcionRonda = leer.nextInt();
        switch (opcionRonda){
            case 1:
                aptoRonda = true;
                break;
            case 2:
                aptoRonda = true;
                tiendaArena.iniciar();
                tiendaArena.setRonda(tiendaArena.getRonda()+1);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
         }
        }while(!aptoRonda);
        if(pelear() && player.getVictorias()<10){
            System.out.println("Ganaste la batalla, preparandonos para la siguiente ronda");
        }
        else if (pelear() && player.getVictorias() >= 10){
            System.out.println("Ganaste con las 10 victorias");
        }
    }
    //pelea
    public boolean pelear(){
        return true;
    }
    //nos envia el objeto jugador
    public Jugador getPlayer(){
        return player;
    }
}
