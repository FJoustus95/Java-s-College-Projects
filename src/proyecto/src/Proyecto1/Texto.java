package proyecto.src.Proyecto1;
public class Texto {
    public void bienvenido(){
        System.out.println("*********|   Bienvenido a  |*********");
    }
    public void titulo(){
        System.out.println("*********|-----------------|*********");
        System.out.println("*********| Super Auto Pets |*********");
        System.out.println("*********|-----------------|*********");
    }
    public void menu(){
        System.out.println("ingresa tu selecciona tu opcion:");
        System.out.println("1. Modo Arena:");
        System.out.println("2. Modo Versus");
        System.out.println("3. Modo Creativo");
        System.out.println("4. Salir");
    }
    public void tituloArena(){
        System.out.println();
        System.out.println();
        System.out.println("*********|-------------------|*********");
        System.out.println("*********|       ARENA       |*********");
        System.out.println("*********|-------------------|*********");
    }
    public void opcionesRonda(){
        System.out.println("*********|-------------------|*********");
        System.out.println("*********|    Ronda previa   |*********");
        System.out.println("*********|-------------------|*********");
        System.out.println("*********|elige tu movimiento|*********");
        System.out.println("*********|-------------------|*********");
        System.out.println("*********| 1.Ordenar Equipo  |*********");
        System.out.println("*********|-------------------|*********");
        System.out.println("*********|     2.tienda      |*********");
        System.out.println("*********|-------------------|*********");
        System.out.println();
        System.out.println();
    }
    public void menuTienda(){
        System.out.println("*********|------------------|*********");
        System.out.println("*********|      TIENDA      |*********");
        System.out.println("*********|------------------|*********");
        System.out.println("*********|1.Comprar mascotas|*********");
        System.out.println("*********|------------------|*********");
        System.out.println("*********| 2.Comprar Comida |*********");
        System.out.println("*********|------------------|*********");
        System.out.println("*********| 3.Vender mascota |*********");
        System.out.println("*********|------------------|*********");

    }
    public void limpiarPantalla(){
        for(int i=0;i<=30;i++){
            System.out.println();
        }
    }
    public void salir(){
        System.out.println("Desea salir?");
        System.out.println("1. SI");
        System.out.println("2. NO");
    }
    public void despedida(){
        System.out.println("*********|------------------|*********");
        System.out.println("*********| Nos vemos pronto |*********");
        System.out.println("*********|------------------|*********");
    }
}