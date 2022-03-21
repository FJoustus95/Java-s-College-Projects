    import javax.swing.JOptionPane;
public class ALP16 {
    public static void main(String [] args) {
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoga una opcion:\n\n1). Viajar\n2). Hacer Tareas\n3). Studying a lenguage\n4). Hacer cardio\n5). Programar\n6). Jugar " , "Hobbies" , 3));
        
        switch (opcion) {
            case 1:
               String viajar = JOptionPane.showInputDialog(null, "A donde quiere viajar??", "Viajar",3);
                    break;
            case 2:
                String hacer_tareas = JOptionPane.showInputDialog(null, "Quiere hacer su tarea", "tarea", 3);
                    break;
                    
            case 3:
                String ingles = JOptionPane.showInputDialog(null, "Quiere practicar ingles??", "Lenguage", 3);
                    break;
            case 4:
                String hacer_cardio = JOptionPane.showInputDialog(null, "quieres correr?" , "Ejercicio", 3);
                    break;
            case 5:
                String programar = JOptionPane.showInputDialog(null, "quieres programar?","programar", 3);
                    break;
            case 6:
                String jugar = JOptionPane.showInputDialog(null, "Que quieres jugar?" , "jugar", 3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Usted no selecciono una opcion correcta");
                Runtime.getRuntime().exit(0);
                  
        }    
    }
}
