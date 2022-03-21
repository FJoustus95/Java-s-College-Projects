
package POO;


public class INSTANCIA {
    
        String marca, color;
        int precio, modelo;
    
    public static void main(String [] args) {
    
        INSTANCIA carro1 = new INSTANCIA();
        INSTANCIA carro2 = new INSTANCIA();
        INSTANCIA carro3 = new INSTANCIA();
        
        carro1.marca = "SUZUKI";
        carro1.color = "azul";
        carro1.precio= 200000;
        carro1.modelo = 2005;
        
        carro2.marca = "Toyota";
        carro2.color = "Rojo";
        carro2.precio = 500000;
        carro2.modelo = 2021;
        
        carro3.marca = "BMW";
        carro3.color = "Verde";
        carro3.precio = 50000;
        carro3.modelo  = 1995;
        
        System.out.println("Mostrando datos del auto 1");
        System.out.println("marca: " +carro1.marca);
        System.out.println("Color: " + carro1.color);
        System.out.println("Precio: " + carro1.precio);
        System.out.println("Modelo: " + carro1.modelo + "\n");
        
        System.out.println("Mostrando datos del auto 2");
        System.out.println("marca: " +carro2.marca);
        System.out.println("Color: " + carro2.color);
        System.out.println("Precio: " + carro2.precio);
        System.out.println("Modelo: " + carro2.modelo + "\n");
        
        System.out.println("Mostrando datos del auto 3");
        System.out.println("marca: " +carro3.marca);
        System.out.println("Color: " + carro3.color);
        System.out.println("Precio: " + carro3.precio);
        System.out.println("Modelo: " + carro3.modelo);
    }
    
}
