package proyecto.src.Proyecto1;
public class Jugador {
    private int oro;
    private int mascotas;
    private int ronda;
    private int tier;
    private int victorias;
    //private Mascota[] mascotasJugador = new Mascota[10];
    //Constructor
    public Jugador(int oro, int mascotas, int ronda, int tier, int victorias) {
        this.oro = oro;
        this.mascotas = mascotas;
        this.ronda = ronda;
        this.tier = tier;
        this.victorias = victorias;
    }
//Getters y Setters
    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getMascotas() {
        return mascotas;
    }

    public void setMascotas(int mascotas) {
        this.mascotas = mascotas;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
}
