import java.util.Scanner;

public class A2E02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        System.out.println("ingrese un numero");
        n = scan.nextInt();

        for(int i = n; i > 0; i--){
            System.out.println(i);
        }
    }
}
