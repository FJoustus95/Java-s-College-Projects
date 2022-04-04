package proyecto.src.Mascotas;
public class Mascota {
    private String nombre;
    private int vida;
    private int danio;
    public Mascota(String nombre, int vida, int danio){
        this.nombre = nombre;
        this.vida = vida;
        this.danio = danio;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Vida: "+this.vida);
        System.out.println("Ataque: "+this.danio);
    }
}
