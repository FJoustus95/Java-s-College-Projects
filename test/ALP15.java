    import javax.swing.JOptionPane;
    
public class ALP15 {
    public static void main(String [] args) {
        
     
        String name = JOptionPane.showInputDialog(null, "Hola como te llamas??" , "Ventana",3);
        int age =   Integer.parseInt(JOptionPane.showInputDialog(null, "Hola" + name + "Que edad tienes??","Ventana",3));
        int money = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuanto dinero traes??" + name, "Ventana",3));
        
            JOptionPane.showMessageDialog(null, "Si traes mas de 500 y eres mayor entonces salgo contigo", "Ventana",1);
            
            
        if(money >= 1000 || age<18) {
            JOptionPane.showMessageDialog(null,"Como traes mas de lo que pensaba no te preguntare la edad xD", "Ventana",1);
            
            
        } else  { if (money >= 500 && age >=18) {
            JOptionPane.showMessageDialog(null, "Como traes los " + money + " y tienes " + age + " años entonces salgamos crack");
            
                
        } else  { if (money <500 && money >= 200 && age<18) {
            JOptionPane.showMessageDialog(null, "Como no cumples lo que pido no vamos a salir");
                    
         } else { if(money < 200 || age < 18 ) {
             JOptionPane.showMessageDialog(null, "La verdad ni cumples con nada alv saquese niño prieto" , "Ventana",2);
             
             
         } else {
             Runtime.getRuntime().exit(0);
         }
       } 
      }
     }
    }
}
        
            
        