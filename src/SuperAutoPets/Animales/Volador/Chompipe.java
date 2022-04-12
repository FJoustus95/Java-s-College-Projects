
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Chompipe extends Animales implements Volador, Terrestre {
    
    //Pertenece a tier 5
    //Solidaridad: Le da (+3/+3)/(+6/+6)/(+9/+9) a un aliado invocado.
    
    //constructor especifico de chompipe
    public Chompipe(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 4, 0);
        
    }

    @Override
    public void AtributosVolador(String name, int attack, int life) {
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
