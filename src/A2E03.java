import java.util.Scanner;

public class A2E03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;

        System.out.println("ingrese un numero");
        num = scan.nextInt();

        for (int i = num-1;i>0;i--)
            num = num * i;
            System.out.println("El factorial es " + num);
    }
}
