import java.util.Scanner;

public class A1E15 {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("ingrese un numero");
        num = scan.nextInt();

        if(num > 0){
            System.out.println(num + " es psotivo");
        }if(num < 0){
            System.out.println(num + " es negativo");
        }if(num == 0){
            System.out.println(num + " es nulo");
        }
    }
}
