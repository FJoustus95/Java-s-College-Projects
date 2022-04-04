
package SuperAutoPets.util;

import java.util.Scanner;
import java.util.Random;

public class Util {
    
    public static Scanner leer = new Scanner(System.in);
    public static Random aleatorio = new Random();

public static int generarNumeroRandom(int min, int max) {
    
    // int tmp = random.nextInt(max-min)+min;
        // System.out.println(tmp);

        // return tmp;
        
    return aleatorio.nextInt( max -( min -1 ))+ 1 + (min - 1);
    
    
    
    }

}
