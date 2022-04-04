

package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Hipopotamo implements Acuatico, Terrestre {
    
    //Pertenece a tier 4
    
    //Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga.
    public Hipopotamo() {
        
        
    }

    @Override
    public void AtributosAcuatico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
