import java.util.Random;

public class A1E19 {
    public static void main(String[] args) {
        int min = 0;
		int max = 1000;
		Random random = new Random();

		int value = random.nextInt(max + min) + min;
    
        if(value/5 == 0 && value<25){


		System.out.println("El numero " + value);
        System.out.println("es correcto");
        }else{
            System.out.println("el numero " + value);
            System.out.println("es incorrecto");
        }
    }
}
