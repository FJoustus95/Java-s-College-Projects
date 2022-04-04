
package SuperAutoPets.Animales.Desertico;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Rinoceronte implements Desertico, Terrestre {
    
    //Pertenece a tier 5
    //Estampida: Inflige 4/8/12 de daño al primer enemigo
    
    public Rinoceronte() {
        
        
        
    }

    @Override
    public void AtributosDesertico(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
