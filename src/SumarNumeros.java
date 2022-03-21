import java.util.Scanner;

/**
 * SumarNumeros
 */
public class SumarNumeros {
    public static void main(String[] args) {

        

        int numero1, numero2, numero3;

        pedirNumero("numero 1");

        String numSolicitado = "numero 2";
        pedirNumero(numSolicitado);

        pedirNumero("numero 3");


    }

    public static void pedirNumero(String identificador){

        Scanner scanner = new Scanner(System.in);

        boolean error = false;
        int numero;

        do {
            System.out.println("Ingrese el numero "+identificador+" por favor:");
            numero = scanner.nextInt();
            if (numero < 0){
                System.out.println("\n\n Error, número "+numero+" invalido, ingrese un numero positivo");
                error = true;
            }
            else{
                error = false;
            }
        } while (error);

        System.out.println("el numero ingresado fue "+ numero);
        System.out.println("\n");
    }
}