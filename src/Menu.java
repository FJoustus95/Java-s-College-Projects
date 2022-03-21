import java.util.Scanner;

/*
    Para mañana llevar el control de 20 estudiantes de la clase
        [0..19]
    1) ingreso de estudiante
        preguntar (código -> posición del arreglo) = 5  nombres[5] = oliver
        -nombre
        -edad
    2) buscar por nombre
    3) buscar por edad
    4) listar todos los estudiantes
*/

public class Menu {

    static Scanner scanner; //global

    static String[] usuarios = new String[20]; // global

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int opcionMenu = 0;
        usuarios[5] = "Oliver";

        while (opcionMenu != 5) {

            System.out.println("hola, usuario");
            System.out.println("Menu: ");
            System.out.println("1. perimetro y area");
            System.out.println("2. saludo ");
            System.out.println("5. salir");

            opcionMenu = pedirNumero("\nIngrese la opción del menú a ejecutar?");

            if (opcionMenu == 1){
                //resultado opción 1
                opcion1();
            }

            if (opcionMenu == 2){
                mensaje("saludo estimado usuario" + usuarios[5]);
            }

            if (opcionMenu == 5){
                //resultado opción 5
                mensaje("Adios estimado usuario");
            }
        }   
    }

    public static void opcion1(){
        int base = pedirNumero("Ingrese la base");
        int altura = pedirNumero("Ingrese la altura");   
        int perimetro = perimetroCuadrado(base, altura);
        int area = areaRectangulo(base, altura);

        mensaje("El resultado de perimetro es:"+perimetro);
        mensaje("El resultado de area es:"+ area);
    }

    public static int perimetroCuadrado(int base, int altura){
        int perimetro = base *2 + 2* altura;
        base = 0;
        return perimetro;
        //return (base *2+altura *2);
    }

    public static int areaRectangulo(int base, int altura){
        int area = base * altura;
        return area;
    }

    public static void mensaje(String mensaje){
        System.out.println("\n********************************");
        System.out.println("         "+mensaje);
        System.out.println("********************************\n");
    }

    public static int pedirNumero(String mensaje){
        int numero = 0;
        boolean hayError = false;
        do {
            System.out.println(mensaje);
            numero = scanner.nextInt();
            if (numero<0){
                hayError = true;
                System.out.println("ingrese un número máyor de cero");
            }
            else{
                hayError = false;
            }
        } while (hayError);
        return numero;

    }
    
}
