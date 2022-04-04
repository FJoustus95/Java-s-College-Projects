
package SuperAutoPets.Animales.Reptil;

import SuperAutoPets.Animales.Desertico.Desertico;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Serpiente implements Reptil, Terrestre, Desertico {
    
    //Pertenece a tier 6 ( top tier de seguro se la pasa spameando puro b xd )
    //Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota aliada de delante ataca
    
    public Serpiente() {
        
        
    }

    @Override
    public void AtributosReptil(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosDesertico(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
