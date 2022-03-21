    import javax.swing.JOptionPane;
    
            
public class ALP12 {
    public static void main(String [] args) {
        
        String name;
        float num1, num2;

            JOptionPane.showMessageDialog(null, "Ingrese un nombre: ", "Ventana Emergente" , 1);
          name =  JOptionPane.showInputDialog(null, "Nombre: " ,"Ingreso de datos" ,3);
          
          num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero " ,"Ingreso de datos" ,1));
          num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un numero " ,"Ingreso de datos" ,1));
    
        float  resultado = num1 + num2;
          
          JOptionPane.showMessageDialog(null, "El nombre es: " + name, "Resultado", 1);
          JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado,"Resultado",1);
    }
}
