package proyecto.src.Proyecto1;
import java.util.Scanner;
import proyecto.src.Mascotas.Mascota;
import proyecto.src.Mascotas.Caballo;
import proyecto.src.Mascotas.Castor;
import proyecto.src.Mascotas.Escarabajo;

public class Tienda {
    private int ronda;
    private final Mascota mascotaaux = new Mascota("default",1,1);
    private final Mascota[] mascotasTienda = new Mascota[12];
    Texto textoTienda = new Texto();
    Scanner leer = new Scanner(System.in);
    public void iniciar(){
        textoTienda.titulo();
        textoTienda.menuTienda();
        int opTienda = leer.nextInt();
        switch (opTienda){
            case 1:
                System.out.println("Comprar mascota");
                //llenamos el stock de la tienda
                for (int i=0;i<3;i++){
                    mascotasTienda[i] = generarMascota();
                }
                //Escribimos el stock
                for (int j=0;j<3;j++){
                    mascotasTienda[j].mostrarDatos();
                }
                break;
            case 2:
                System.out.println("Comprar comida");
                break;
            case 3:
                System.out.println("Vender mascota");
                break;
            default:
                break;
        }
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public Mascota generarMascota(){
        int random = (int) Math.floor(Math.random()*(3-1+1)+1);
        if (random == 1){
            return new Caballo("Caballo",1,1);
        }
        else if(random == 2){
            return new Castor("Castor",1,1);
        }
        else if (random == 3){
            return new Escarabajo("Escarabajo",1,1);
        }
        return new Mascota("Default",1,1);
    }
}
