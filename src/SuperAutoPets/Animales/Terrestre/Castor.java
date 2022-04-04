
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Acuatico.Acuatico;


public class Castor implements Terrestre, Acuatico {
    
    //Pertenece a tier 1
    //Represa: Da a 2 aliados al azar +1/+2/+3 HP al venderse
    
    public Castor() {
     
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosAcuatico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
