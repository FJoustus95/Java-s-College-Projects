    import java.util.Scanner;
    
public class ALP11 {
    public static void main(String [] args) {
    
    String name = "";
    String address = "";
    int number_phone = 0;
    String last_name = "";
    
        Scanner leer = new Scanner(System.in);
        
            System.out.println("Ingrese el nombre: ");
            name = leer.nextLine();
            
            System.out.println("Ingrese la direccion: ");
            address = leer.nextLine();
            
            System.out.println("Ingrese el apellido: ");
            last_name = leer.nextLine();
            
            System.out.println("Ingrese el numero de celular");
            number_phone = leer.nextInt();
            
            System.out.println("El nombre es: " + name + " con apellidos: " + last_name + " direccion: " + address + " numero de celular: "+ number_phone);
            
        }
    
        
    }