import java.util.Scanner;

public class A1E20 {
    public static void main(String[] args) {
        int num, aux, inverso = 0, cifra;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Introduce un número mayor que 10: ");                                                 
            num = scan.nextInt();
        } while (num < 10);
       
        aux = num;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
    
        if(num == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}
