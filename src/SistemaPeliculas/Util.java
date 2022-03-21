package SistemaPeliculas;

import java.util.Random;
import java.util.Scanner;

public class Util {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

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

    public static String solicitarString(String mensaje) {
        String respuesta = "";
        boolean hayErrorStringIngresado = false;

        do {
            System.out.println("\n" + mensaje);
            respuesta = scanner.nextLine();
            // scanner.nextLine();//probar
            respuesta = respuesta.trim();
            if (respuesta.length() > 0) {
                hayErrorStringIngresado = false;
            } else {
                hayErrorStringIngresado = true;
                System.out.println("Ingresa un caracter como minimo.");
            }

        } while (hayErrorStringIngresado);

        return respuesta;
    }

}
