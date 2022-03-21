    import javax.swing.JOptionPane;

    
    public class ALP13 {
        public static void main(String [] args) {
            
    String name;
    Double money;        
    
    name = JOptionPane.showInputDialog(null,"Holaa como te llamas? : ", "Pregunta" ,3);
    money = Double.parseDouble(JOptionPane.showInputDialog(null," cuanto dinero traes: ", "Pregunta" ,3));
    
    if (money >= 300) {
            JOptionPane.showMessageDialog(null,"Salgamos un rato " +  name, "Divertirse xD" ,1);
        
    } else {
            JOptionPane.showMessageDialog(null,"No andas pisto chinga tu madre "+ name, " xD" ,1);
        
    }
    
    
        }
    
}
