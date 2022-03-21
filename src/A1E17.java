import java.util.Scanner;

public class A1E17 {
    public static void main(String[] args) {
        double ladoa = 0, ladob = 0, ladoc = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("por favor ingrese el lado a");
        ladoa = scan.nextDouble();

        System.out.println("por favor ingrese el lado b");
        ladob = scan.nextDouble();

        System.out.println("por favor ingrese el lado b");
        ladoc = scan.nextDouble();

        if(ladoa == ladob && ladob == ladoc){
            System.out.println("el triangulo es equilatero");
        }if(ladoa == ladob){
            System.out.println("el triangulo es isoceles");
        }else{
            System.out.println("el triangulo es Escaleno");
        }
    

    } 

}