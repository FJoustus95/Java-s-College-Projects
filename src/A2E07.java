
public class A2E07 {
    public static void main(String [] args) {
        
        int cantidad_pares = 0;
        int cantidad_impares = 0;
        int cantidad_ceros = 0;
        
    for(int i =0; 1<15; i++) {
        
        int numero_random = (int) (Math.random()*36));
        System.out.println(numero_random);
        
        if (numero_random == 0) {
            cantidad_ceros++;
            
        }
        if (numero_random % 2 == 0) {
            cantidad_pares ++;
            
                     
        } else {
            cantidad_impares ++;
            
        }
        
    }
    double porcentaje_pares = (cantidad_impares/ 15d)*100d;   
    double porcentaje_impares = (cantidad_impares/ 15d)*100d;
    double porcentaje_ceros = (cantidad_ceros/ 15d)*100d;
    }
}
