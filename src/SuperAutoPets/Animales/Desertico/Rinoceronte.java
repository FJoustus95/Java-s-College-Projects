
package SuperAutoPets.Animales.Desertico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Rinoceronte extends Animales implements Desertico, Terrestre {
    
    //Pertenece a tier 5
    //Estampida: Inflige 4/8/12 de daño al primer enemigo
    
    //constructor especifico de rinoceronte
    public Rinoceronte(String name) {
        //llamando al constructor de la superclase
        super(name, 5, 8, 0);
        
        
        
    }

    @Override
    public void AtributosDesertico(String name, int attack, int life) {
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
