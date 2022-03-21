
import java.util.Scanner;

public class Menu_opciones
{
public static void main(String args[])
{
         int ch;
         String str,str1,str2;
         boolean str3;
         int length;
        
         Scanner leer = new Scanner(System.in);
        
         do
         {
        
          // displaying the menu
        
          System.out.println("\n1: Opcion 1");
          System.out.println("2: Opcion 2");
          System.out.println("3: Opcion 3");
          System.out.println("4: Opcion 4");
          System.out.println("5: Salir");
 
        
             System.out.print("\n Escoge una opcion: ");  
             ch = leer.nextInt(); // reading user's choice
            
        
         System.out.println("\n");
                  
              switch (ch)
              {
                case 1: // for length of string
                 leer.nextLine();
                 System.out.println("Escogiste la Opcion 1: ");
                   
                break;
                
                case 2:  //for string concatenation
                 leer.nextLine();
                 System.out.println("Escogiste la opcion 2 ");
                   
                
                 break;
                
                case 3:  // for string comparison
                 leer.nextLine();
                   System.out.println("Escogiste la opcion 3: ");
                     
                
                 break;
                
                case 4:  // for string trimming
                 leer.nextLine();
                 System.out.println("Escogiste la opcion 4 ");
                   
 
                 break;
                
                case 5:
                 System.exit(0);
                
                default:
                 System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
               }
         }while(ch < '1' || ch > '5');
            
              }
 
    
    }