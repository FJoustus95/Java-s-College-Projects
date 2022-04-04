
package SuperAutoPets.Animales.Insecto;

import SuperAutoPets.Animales.Terrestre.Terrestre;

public class Hormiga  implements Insecto, Terrestre {
    
    //Pertenece a tier 1
    //Compañerismo: Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir.
    public Hormiga() {
        
    }

    @Override
    public void AtributosInsecto(int attack, int liffe, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
