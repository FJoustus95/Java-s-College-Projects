package SistemaPeliculas;

//       compilar
//javac -d build/ src/*.java
//       Ejecutar
//java -cp build/ Memorabilia 

//Menu como el del laberinto
//1)ingreso de peliculas
//2) mostrar peliculas
//3) (bono) mostrar peliculas de un tipo en especifico 
//4) ingreso de clientes
//5) mostrar clientes

/**
 * Memorabilia
 */
public class Memorabilia {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuPrincipal();
        //new Menu().menuPrincipal();
    }
}