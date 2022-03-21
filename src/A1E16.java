import java.util.Scanner;

public class A1E16 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("por favor ingrese el primer numero");
        num1 = scan.nextInt();

        System.out.println("por favor ingrese el segundo numero");
        num2 = scan.nextInt();

        System.out.println("por favor ingrese el tercer numero");
        num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("el numero mas grande es: " + num1);
        }if(num2 > num1 && num2 > num3){
            System.out.println("El numero mas grande es " + num2);
        }if(num3 > num1 && num3 > num2){
            System.out.println("el numero mas grande es " + num3);
        }
    }
}
