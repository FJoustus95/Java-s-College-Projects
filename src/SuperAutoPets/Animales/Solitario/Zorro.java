
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Zorro implements Solitario, Terrestre {
    
    //Pertenece a tier 2
    //Ataque Rápido: Ataca 2 veces seguidas cada (3 turnos)(2 turnos)(1 turno)
   
    public Zorro() {
        
        
        
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
