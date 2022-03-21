

import java.util.Random;


public class A1E06 {
    public static void main(String [] args) {
       
        int min = 0;
        int max = 200;
        Random random = new Random();
        float porcentaje;
        float numero_aumentado;
                
        int numero_aleatorio = random.nextInt(min + max)+ min;
            System.out.println("El numero random generado es: " + numero_aleatorio);
            
                     porcentaje = (float) ((numero_aleatorio* 30)/100);
        
            System.out.println("El porcentaje del numero aleatorio es: " + porcentaje);
        
                    numero_aumentado = (float) (numero_aleatorio + porcentaje);
        
            System.out.println("El numero aleatorio incrementado su 30% es : " + numero_aumentado);
            
            
            
    }
}
