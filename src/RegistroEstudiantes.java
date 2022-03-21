import java.util.Scanner;

/**
 * RegistroEstudiantes
 */
public class RegistroEstudiantes {
    // variables globales

    public static Scanner scanner;
    public static String[] nombres = new String[20];
    // [códigos o carné ] [pos 0 edad y pos 1 = tel]
    public static int[][] edadTel = new int[20][2];

    // fin variables globales

    public static void main(String[] args) {

        scanner = new Scanner(System.in);
        int opcionMenu = 0;

        while (opcionMenu != 5) {
            System.out.println("    programa control de estudiantes");
            System.out.println("*****************************************");
            System.out.println("1) Ingreso de estudiantes.");
            System.out.println("2) Consulta de estudiante.");
            System.out.println("3) Editar estudiante.");
            System.out.println("4) Listar todos.");
            System.out.println("5) Salir.");
            opcionMenu = solicitarNumero("Ingrese la opción del menú a ejecutar", 1, 5);

            if (opcionMenu == 1) {
                ingresoEstudiantes();
            }

            if (opcionMenu == 2) {
                consultaEstudiantes();
            }

            if (opcionMenu == 3) {
                editarEstudiante();
            }

            if (opcionMenu == 4) {
                listaEstudiantes();
            }

            if (opcionMenu == 5) {
                System.out.println("adios");
            }

        }
    }

    public static void listaEstudiantes() {
        System.out.println("*******listado");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(infoEstudiante(i));
        }
    }

    public static void editarEstudiante() {
        int submenu = 0;
        int carne = solicitarNumero("Ingrese el carne del estudiante a consultar", 0, 19);
        if (nombres[carne] != null) {
            do {
                System.out.println("modificacion de estudiante");
                System.out.println(infoEstudiante(carne) + "\n\n");
                System.out.println(" 1) modificar edad");
                System.out.println(" 2) modificar nombre");
                System.out.println(" 3) modificar telefono");
                System.out.println(" 4) salir");

                submenu = solicitarNumero("opcion", 1, 4);
                switch (submenu) {
                    case 1:
                        edadTel[carne][0] = solicitarNumero("Ingrese la edad", 1, 115);
                        break;
                    case 2:
                        nombres[carne] = solicitarString("Ingrese el nombre ");
                        break;
                    case 3:
                        edadTel[carne][1] = solicitarNumero("Ingrese el telefono", 9999, 10000);
                        break;
                    default:
                        System.out.println("adios submenu");
                        break;
                }

            } while (submenu != 4);

        } else {
            System.out.println("no existe el usuario");
        }

    }

    public static void consultaEstudiantes() {
        System.out.println("\n\n**********Consulta estudiantes \n\n");
        int carne = solicitarNumero("Ingrese el carne del estudiante a consultar", 0, 19);
        System.out.println(infoEstudiante(carne));
        ;
    }

    public static void ingresoEstudiantes() {
        System.out.println("\n\n**********Ingreso de estudiantes \n\n");

        int carne = solicitarNumero("Ingrese el número de carne", 0, 19);
        // podría reivisarse si esta ocupado o no
        String nombre = solicitarString("Ingrese el nombre del estudiante");
        int edad = solicitarNumero("Ingrese la edad del estudiante", 1, 115);
        int telefono = solicitarNumero("Ingrese el numero de telefono", 999, 10000);

        System.out.println("\nCarne: " + carne);
        System.out.println("nombre:" + nombre);
        System.out.println("edad: " + edad);
        System.out.println("telefono:" + telefono);
        System.out.println("\nSeguro que desea guardar el estudiante?");
        int opcion = solicitarNumero("Ingrese 0-no, 1-si:", 0, 1);
        if (opcion == 1) {
            nombres[carne] = nombre;
            edadTel[carne][0] = edad;
            edadTel[carne][1] = telefono;
            System.out.println("****** Guardado con éxito ** * ** ");
        } else {
            System.out.println("****** No se guardo ningún cambio ** * ** ");
        }
    }

    public static String infoEstudiante(int carne) {
        // revisar si existe la informaicón
        if (nombres[carne] != null) {
            String res = "";
            res = res + "**Carne: " + carne;
            res = res + "  Nombre: " + nombres[carne];
            res = res + "  Edad: " + edadTel[carne][0];
            res = res + "  Telefono: " + edadTel[carne][1];
            return res;
        }
        String resp = "**Carne: " + carne + " no ingresado";
        return resp;

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