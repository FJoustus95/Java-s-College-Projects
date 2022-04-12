

package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Hipopotamo extends Animales implements Acuatico, Terrestre {
    
    //Pertenece a tier 4
    
    //Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga.
    
    //constructor especifico de hipopotamo
    public Hipopotamo(String name) {
        //llamando al constructor de la superclase
        super(name, 4, 7, 0);
        
        
    }

    @Override
    public void AtributosAcuatico(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int life() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eachEffectAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eachAbilityAnimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String types() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
