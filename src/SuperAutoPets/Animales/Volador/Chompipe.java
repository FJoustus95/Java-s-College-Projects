
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Chompipe implements Volador, Terrestre {
    
    //Pertenece a tier 5
    //Solidaridad: Le da (+3/+3)/(+6/+6)/(+9/+9) a un aliado invocado.
    
    public Chompipe() {
        
        
    }

    @Override
    public void AtributosVolador(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
