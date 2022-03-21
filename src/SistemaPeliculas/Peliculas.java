package SistemaPeliculas;

public class Peliculas {
    private final int MAXIMO_DE_PELICULAS = 100;
    private int contadorPeliculas = 0;
    private Pelicula[] peliculasDisponibles = new Pelicula[MAXIMO_DE_PELICULAS];

    // CONSTRUCTOR POR DEFECTO PORQUE NO NECESITO HACER NADA

    public void crearPelicula() {

        if (contadorPeliculas < MAXIMO_DE_PELICULAS) {
            System.out.println("El id que le corresponde es " + this.contadorPeliculas);
            int anyo = Util.solicitarNumero("Año de lanzamiento ", 1000, 2023);
            String nombre = Util.solicitarString("Ingres el nombre de la pelicula: ");
            String categoria = Util.solicitarString("Ingrese la categoria de la pelicula:");
            peliculasDisponibles[this.contadorPeliculas] = new Pelicula(this.contadorPeliculas, anyo, nombre,
                    categoria);
            this.contadorPeliculas++;
        }
        else{
            System.out.println("No se pueden crear más peliculas. ");
        }
    }

    public void listarPeliculas(){
        System.out.println("Listado de peliculas");
        for (int i = 0; i < this.contadorPeliculas; i++) {
            System.out.println(peliculasDisponibles[i].toString());
        }
    }

}
