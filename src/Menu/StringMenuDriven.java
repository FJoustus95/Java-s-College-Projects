
import java.util.Scanner;

public class StringMenuDriven
{
public static void main(String args[])
{
         int ch;
         String str,str1,str2;
         boolean str3;
         int length;
        
         Scanner sc = new Scanner(System.in);
        
         do
         {
        
          // displaying the menu
        
          System.out.println("\n1: Length Of String");
          System.out.println("2: String Concatenation");
          System.out.println("3: String Comparison");
          System.out.println("4: String Trimming");
          System.out.println("5: Quit");
 
        
             System.out.print("\n Make your choice: ");  
             ch = sc.nextInt(); // reading user's choice
            
        
         System.out.println("\n");
                  
              switch (ch)
              {
                case 1: // for length of string
                 sc.nextLine();
                 System.out.println("Enter string: ");
                   str=sc.nextLine();
                   length = str.length();
                   System.out.println("Length of string: " + length);
                break;
                
                case 2:  //for string concatenation
                 sc.nextLine();
                 System.out.println("Enter First string: ");
                   str=sc.nextLine();
                   System.out.println("Enter Second string: ");
                 str1=sc.nextLine();
                   str2 = str.concat(str1);
                   System.out.println("First String: "+ str);
                 System.out.println("Second String: "+ str1);
                 System.out.println("\nConcatenated string: "+ str2);
                
                 break;
                
                case 3:  // for string comparison
                 sc.nextLine();
                   System.out.println("Enter First string: ");
                     str=sc.nextLine();
                     System.out.println("Enter Second string: ");
                   str1=sc.nextLine();
                     str3 = str.equals(str1);
                     System.out.println("First String: "+ str);
                   System.out.println("Second String: "+ str1);
                   System.out.println("\nComparison Of String: "+ str3);
                
                 break;
                
                case 4:  // for string trimming
                 sc.nextLine();
                 System.out.println("Enter string: ");
                   str=sc.nextLine();
                   str1= str.trim();
                   System.out.println("\nTrimmed String:" + str1);
 
                 break;
                
                case 5:
                 System.exit(0);
                
                default:
                 System.out.println("Invalid choice!!! Please make a valid choice. \n\n");
               }
         }while(ch < '1' || ch > '5');
            
              }
 
    
    }