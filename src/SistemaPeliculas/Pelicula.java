package SistemaPeliculas;

public class Pelicula {
    private int id;
    private int anyo;
    private String nombre, categoria;
    private boolean disponible;

    private static int cantInstanciasPelicula = 0;
    
    


    public void setId(int id) {
        this.id = id;
    }

    //constructor
    public Pelicula(int id, int anyo, String nombre, String categoria){
        Pelicula.cantInstanciasPelicula++;
    
        this.id = id;    
        this.anyo = anyo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.disponible = true;    
    }

    @Override
    public String toString() {
        return "" +
            " =" + getId() + "'" +
            ", anyo='" + getAnyo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", disponible='" + isDisponible() ;
    }

    // getters setters

    public int getId() {
        return this.id;
    }

    public int getAnyo() {
        return this.anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public boolean getDisponible() {
        return this.disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getCantidadInstancias(){
        return cantInstanciasPelicula;
    }
    
}
