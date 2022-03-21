import java.util.Random;
import java.util.Scanner;

public class A2E01 {
    public static void main(String[] args) {
        int n = 0, r = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("ingresa un numero");
        n = scan.nextInt();

        for(int i = 0; i < n ; i++){ 

		Random random = new Random();
        r = random.nextInt(100); 
        if(r%2 == 0){ 
        System.out.println("el numero " + r + " es par");
        }else{
            System.out.println("el numero " + r + " es impar");
        }
        }

        }

    }

