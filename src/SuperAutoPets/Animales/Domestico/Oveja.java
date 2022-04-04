
package SuperAutoPets.Animales.Domestico;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Oveja implements Domestico, Terrestre {
    
    //Pertenece a tier 3
    //Revolución: invoca dos (2/2)/ (4/4) / (6/6) carneros al morir
    
    public Oveja() {
        
        
        
    }

    @Override
    public void AtributosDomestico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
