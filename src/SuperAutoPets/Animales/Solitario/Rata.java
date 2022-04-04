
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Rata implements Solitario, Terrestre {
    
    //Pertenece a tier 2
    //Ayuda hipócrita: invoca 1/2/3 1/1 Dirty Rats al frente para el oponente al morir.
    public Rata() {
       
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
