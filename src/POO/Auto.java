
package POO;


public class Auto {
    int modelo, precio;
    String marca, color;
    
    void arrancarAuto(int model, int price, String marka, String colors) { 
        System.out.println("El auto " + marka + " modelo " + model + " de color " + colors + " y con un precio de " + price);
        System.out.println("Ha arrancado\n");
     
    }
    void pararAuto (int model, int price, String marka, String colors) {
        System.out.println("El auto " + marka + " modelo " + model + " de color " + colors + " y con un precio de " + price);
        System.out.println("Ha parado\n");
         
    }
    void encenderAuto (int model, int price, String marka, String colors) {
        System.out.println("El auto " + marka + " modelo " + model + " de color " + colors + " y con un precio de " + price);
        System.out.println("Ha encendido\n");
        
    }
    void apagarAuto ( int model, int price, String marka, String colors) {
        System.out.println("El auto " + marka + " modelo " + model + " de color " + colors + " y con un precio de " + price);
        System.out.println("Se ha apagado uyyy\n");
        
        
    }

}
