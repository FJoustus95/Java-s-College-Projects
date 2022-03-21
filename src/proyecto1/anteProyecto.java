

import java.util.Scanner;
public class proyecto1 {
    public static void main(String[] args) {
        int op;
        int salir=1;
        Scanner leer = new Scanner(System.in);
        texto dialogos = new texto();
        juego play = new juego();
        do{
            dialogos.linea();
            System.out.print("Bienvenido al juego del laberinto");
            dialogos.linea();
            System.out.println("\nPor favor elige las opciones");
            System.out.println("1. jugar\n2. Crear mapa\n3. Reportes\n4. Visualizar mapa\n5. Salir");
            dialogos.linea2();
            op = leer.nextInt();
            switch (op) {
                case 1 -> play.jugar();
                case 2 -> play.crearLaberintos();
                case 3 -> play.reportes();
                case 4 -> play.mostrarLaberintos();
                case 5 -> {
                    salir = 0;
                    dialogos.salida();
                }
            }
        }while(salir!=0);
    }


public class juego {
    Scanner leer = new Scanner(System.in);
    Scanner leerS = new Scanner(System.in);
    int opcionLaberinto;
    int laberintosCreados = 1;
    String nombreLaberinto;
    jugador player = new jugador();
    Laberinto[] listadoLaberintos = new Laberinto[6];
    public void jugar(){
       /* System.out.println("Seleccione el laberinto en el que desea mostrar");
        System.out.println("1-2-3-4-5");
        opcionLaberinto = leer.nextInt();
        mostrarlaberintoX(laberinto);
        System.out.println(player.getOro());*/
    }

    public void mostrarLaberintos(){
        /*System.out.println("Seleccione el laberinto que desea mostrar");
        System.out.println("1-2-3-4-5");
        opcionLaberinto = leer.nextInt();
        Laberinto[opcionLaberinto].mostrar();*/
    }


    public void crearLaberintos(){
        Laberinto laberintodefault = new Laberinto("Default");
        listadoLaberintos[0]=laberintodefault;
        mostrarMapas();

        System.out.println("Ingrese el nombre del nuevo laberinto");
        nombreLaberinto = leerS.nextLine();
        Laberinto laberintoaux = new Laberinto(nombreLaberinto);
        listadoLaberintos[laberintosCreados] = laberintoaux;
        laberintosCreados++;

    }


    public void reportes(){

    }

    public void mostrarMapas(){
        System.out.println("Bienvenido a la creacion de mapas\nRecuerda que solo puedes crear 5 mapas");
        System.out.println("Recuerda que los mapas se van agregando segun los vayas creando");
        System.out.println("Por el momento los mapas que tienes son:");
        for (int i=0;i<laberintosCreados;i++){
            System.out.println(i+". "+listadoLaberintos[i].getNombre());
        }
        System.out.println("Para continuar presiona cualquier tecla para continuar");
    }
}


}


