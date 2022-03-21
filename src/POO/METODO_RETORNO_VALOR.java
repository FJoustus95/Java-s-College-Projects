
package POO;


public class METODO_RETORNO_VALOR {
    public static void main(String [] args) {
        
        int resultado;
        double radio;
        boolean es_valor;
        
        Operaciones operacion1 = new Operaciones();
        resultado = operacion1.suma(10, 10);
        System.out.println("La suma de la operacion es: " + resultado );
        
        System.out.println();
        
        resultado = operacion1.resta(10, 10);
        System.out.println("La resta de la operacion es: " + resultado);
        
        System.out.println();
        
        radio = operacion1.areaCirculo(10);
        System.out.println("El area de circulo es: "+ radio);
     
        
        System.out.println();
        System.out.println("Alcolimetro");
        es_valor =operacion1.estado(10);
        if(es_valor == true){
            System.out.println("Estas ebrio mi pana xD");
            
            
        }else {
            System.out.println("Estas mas sobrio que ned flanders nwn");
            
        }
        
    }
}
