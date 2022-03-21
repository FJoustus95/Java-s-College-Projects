import java.util.Random;
import java.util.Scanner;

public class Totito {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static int[][] matriz = new int[3][3];

    public static void main(String[] args) {
        jugar();

    }

    public static void jugar() {
        boolean finDeJuego = false;

        while (!finDeJuego) {

            //revisar que alguien haya ganado
            turnoJugador(1);
            int ganador = jugadorGanador();
            if (ganador!= 0){
                pintarTablero();
                System.out.println("hay ganador, jugador "+ganador);
                finDeJuego = true;
            }

            

        }
    }


    /**
     * 
     * @return 0 = no hay ganador, 1 x, 2 o
     */
    public static int jugadorGanador(){
        int res =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j]!=0){
                    //horizontal
                    if (revisarCasilla(i-2,j,matriz[i][j]) && revisarCasilla(i-1,j,matriz[i][j])){
                        System.out.println("condicion1");
                        return matriz[i][j];
                    }
                    if (revisarCasilla(i+2,j,matriz[i][j]) && revisarCasilla(i+1,j,matriz[i][j])){
                        System.out.println("condicion2");
                        return matriz[i][j];
                    }
                    //vertical
                    if (revisarCasilla(i,j-2,matriz[i][j]) && revisarCasilla(i,j-1,matriz[i][j])){
                        System.out.println("condicion3 x"+j+" y "+i);
                        return matriz[i][j];
                    }
                    if (revisarCasilla(i,j+2,matriz[i][j]) && revisarCasilla(i,j+1,matriz[i][j])){
                        System.out.println("condicion4");
                        return matriz[i][j];
                    }
                    
                    //diagonal
                    if (revisarCasilla(i+2,j+2,matriz[i][j]) && revisarCasilla(i+1,j+1,matriz[i][j])){
                        System.out.println("condicion5");
                        return matriz[i][j];
                    }
                    if (revisarCasilla(i+2,j-2,matriz[i][j]) && revisarCasilla(i+1,j-1,matriz[i][j])){
                        System.out.println("condicion6");
                        return matriz[i][j];
                    }
                    if (revisarCasilla(i-2,j+2,matriz[i][j]) && revisarCasilla(i-1,j+1,matriz[i][j])){
                        System.out.println("condicion7");
                        return matriz[i][j];
                    }
                    if (revisarCasilla(i-2,j-2,matriz[i][j]) && revisarCasilla(i-1,j-1,matriz[i][j])){
                        System.out.println("condicion8");
                        return matriz[i][j];
                    }
                }
            }
            
        }
        return res;
    }

    public static boolean revisarCasilla(int y, int x, int tipo) {
        boolean res = false;
        if ((x>=0)&&(y>=0)){
            if ((x<matriz[0].length) && (y<matriz.length)){
                //la pos exista
                if (tipo == matriz[y][x]){
                    res = true;
                }
            }
        }

        return res;
        
    }


    public static boolean posicionVacia(int x, int y) {
        if (matriz[y][x] != 0) {
            return false;
        }
        return true;
    }

    /*********** USUARIO JUGADOR ***********/
    public static void turnoJugador(int tipoFicha) {
        System.out.println("***** turno del usuario");
        pintarTablero();
        int posX = 0;
        int posY = 0;
        boolean seleccionoPosicionVacia = false;

        do {
            posX = solicitarNumero("Ingrese la coordenada en X", 0, 2);
            posY = solicitarNumero("Ingrese la coordenada en Y", 0, 2);
            seleccionoPosicionVacia = posicionVacia(posX, posY);
            if (!seleccionoPosicionVacia){
                pintarTablero();
                System.out.println("\nla posicion seleccionada no esta vacía, intente de nuevo");
            }

        } while (!seleccionoPosicionVacia);
        matriz[posY][posX] = tipoFicha;

    }

    /*********** FIN USUARIO JUGADOR ***********/

    /*********** BOOT JUGADOR ***********/

    /*********** FIN BOOT JUGADOR ***********/

    /*********** PINTAR TABLERO ***********/

    public static void pintarTablero() {
        for (int i = 0; i < matriz.length; i++) {

            // String linea = "";
            // for (int j = 0; j < matriz[0].length; j++) {
            // linea = linea +matriz[i][j] + "|";
            // }
            // System.out.println(linea);
            // if (i < (matriz[0].length - 1)) {
            // for (int k = 0; k < linea.length(); k++) {
            // System.out.print("-");
            // }
            // }
            // System.out.println();

            String linea0 = "";
            String linea1 = "";
            String linea2 = "";
            for (int j = 0; j < matriz[0].length; j++) {
                linea0 = linea0 + pintarFila(matriz[i][j], 0);
                linea1 = linea1 + pintarFila(matriz[i][j], 1);
                linea2 = linea2 + pintarFila(matriz[i][j], 2);
                if ((j == 0) || (j == 1)) {
                    linea0 = linea0 + " | ";
                    linea1 = linea1 + " | ";
                    linea2 = linea2 + " | ";
                }
            }

            System.out.println(linea0);
            System.out.println(linea1);
            System.out.println(linea2);

            if (i < (matriz[0].length - 1)) {
                for (int k = 0; k < linea2.length(); k++) {
                    System.out.print("-");
                }
                System.out.println();
            }

        }
    }

    /**
     * 
     * @param tipo 0 vacio, 1 x, 2 y
     * @param fila 0 fila 1, 1 fila 2, 2 fila 3
     * @return string con la cadena caracteres a pintar
     */
    public static String pintarFila(int tipo, int fila) {
        String res = "    ";
        if (tipo != 0) {
            if (tipo == 1) {
                if (fila == 1) {
                    res = " XX ";
                } else {
                    // podríamos validar
                    res = "X  X";
                }
            } else {
                if (tipo == 2) {
                    if (fila == 1) {
                        res = "O  O";
                    } else {
                        res = " OO ";
                    }
                }
            }
        }
        return res;
    }

    /*********** FIN PINTAR TABLERO ***********/

    /*********** FUNCION DE AYUYA ***********/

    public static int generarNumeroRandom(int min, int max) {
        // int tmp = random.nextInt(max-min)+min;
        // System.out.println(tmp);

        // return tmp;
        return random.nextInt(max - min) + min;
    }

    public static int solicitarNumero(String mensaje, int limiteInferior, int limiteSuperior) {
        int numeroIngresado = 0;
        boolean hayErrorNumeroIngresado = false;
        do {
            try {

                System.out.println("\n" + mensaje);
                numeroIngresado = scanner.nextInt();
                if ((numeroIngresado >= limiteInferior) && (numeroIngresado <= limiteSuperior)) {
                    hayErrorNumeroIngresado = false;
                } else {
                    hayErrorNumeroIngresado = true;
                    System.out.println(
                            "Debe ingresar un número entre [" + limiteInferior + " . . " + limiteSuperior + "]");
                    System.out.println("Ingrese de nuevo.");
                }
            } catch (Exception e) {
                hayErrorNumeroIngresado = true;
                System.out.println(
                        "Debe ingresar un número entre [" + limiteInferior + " . . " + limiteSuperior + "]");
                System.out.println("Ingrese un numero entero.");

            }
            scanner.nextLine();
        } while (hayErrorNumeroIngresado);
        return numeroIngresado;
    }

    /*********** FIN FUNCION DE AYUYA ***********/
}

/*
 * 
 * String linea0 = "";
 * for (int j = 0; j < matriz[0].length; j++) {
 * linea0 = linea0 + pintarFila(matriz[i][j], 0);
 * if ((j == 0) || (j == 1)) {
 * linea0 = linea0 + " | ";
 * }
 * }
 * 
 * String linea1 = "";
 * for (int j = 0; j < matriz[0].length; j++) {
 * linea1 = linea1 + pintarFila(matriz[i][j], 1);
 * if ((j == 0) || (j == 1)) {
 * linea1 = linea1 + " | ";
 * }
 * }
 * String linea2 = "";
 * for (int j = 0; j < matriz[0].length; j++) {
 * linea2 = linea2 + pintarFila(matriz[i][j], 2);
 * if ((j == 0) || (j == 1)) {
 * linea2 = linea2 + " | ";
 * }
 * }
 */
