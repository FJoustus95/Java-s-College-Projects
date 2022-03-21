
import java.util.Scanner;


public class A1E11 {
    
    public static void main(String [] args) {
        
        double centimetros;
        double yardas = 0.0109361;
        double metros = 0.01;
        double pies = 0.0328084;
        double pulgadas = 0.393701;
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad para convertir (centimetros)");
               
         centimetros = leer.nextDouble();
        
            double cm_to_yard = (centimetros * yardas);
            double cm_to_meters = (centimetros * metros);
            double cm_to_foot = (centimetros * pies);
            double cm_to_inches = (centimetros * pulgadas);
        
        System.out.println("Ingreso " + centimetros + " centimetros, se convertiran a:\n" + cm_to_yard + " yardas\n" + cm_to_meters + " metros\n" + cm_to_foot + " pies\n" + cm_to_inches + " Pulgadas");    
        
        
    }
}
