import java.security.DigestException;
import java.util.Scanner;

public class A1E18 {
    public static void main(String[] args) {
        int num=0, suma = 0;
        int[] digitos = new int[4];
        int tam = 0;
        String cadena = "";
        Scanner scan = new Scanner(System.in);
        

        System.out.println("ingresa un numero de maximo 4 digitos");
        num = scan.nextInt();
        cadena = String.valueOf(num);
        tam = cadena.length();
        
        if(tam < 5){ 

        for(int i = 0; i < tam; i++){
            digitos[i]=Integer.parseInt(cadena.substring(i, i+1));
            
        }
        
        for(int i = 0; i < 5; i++){
            
            System.out.println("Posicion " + i + ": " + digitos[i]);
            
        }

        }else{
            System.out.println("el numero no es valido");
        }
    }
            
}

