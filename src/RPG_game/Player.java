
package RPG_game;


public class Player extends Characters {
        
        //Interos para almacenar numero de mejoras/habilidades 
        public int numAtkUpgrades, numDeUpgrades;
        
    
        
        //arreglo para almacenar habilidades
        public String[] mejorAtaque = {"Strength", "Power", "Hight", "Godlike Strength"};
        public String[] mejoraDefensa = {" Heavy Bones", "Stoneskin", "Scale Armor", "Holy Aura"};
        
        
        //Constructor especifico del jugador
        public Player(String name) {
        //llamando al constructor de la super clase
        super(name, 100, 0);
        
        //Ajuste de numero de actualizaciones para 0
        this.numAtkUpgrades = 0;
        this.numDeUpgrades = 0;
        
        //funcion para crear rasgos cuando crea un jugador
        
        escogerRasgo();
    }
        
    
    //Metodo especifico de jugador
    @Override
    public int attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //dejar que el jugador escoja un rasgo de cualquiera habilidad 
    public void escogerRasgo(){
        GameLogic.limpiarConsola();
        GameLogic.imprimirTitulo("Escoja un rasgo:");
        System.out.println("1) " + mejorAtaque[numAtkUpgrades] );
        System.out.println("2) " + mejoraDefensa [numDeUpgrades]);
        
        //obtener eleccion de jugadores
        int input = GameLogic.readInt(" -> ", 2);
        GameLogic.limpiarConsola();
        
        //tratar ambos casos
        if (input == 1) {
            GameLogic.imprimirTitulo("tu escogiste " + mejorAtaque[numAtkUpgrades] );
            numAtkUpgrades++;
            
            
            
        } else {
            GameLogic.imprimirTitulo("tu escogiste " + mejoraDefensa[ numDeUpgrades]);
            numDeUpgrades++;
            
        }
       GameLogic.anythingToContinued();
       
    }
}
