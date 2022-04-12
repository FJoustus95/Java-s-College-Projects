
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Animales;


public class Mapache extends Animales implements Solitario {
    
    //Pertenece a tier 3
    //Repartir poder: Otorga 1x/2x/3x ATK a las mascotas adyacentes al morir
    
    //constructor especifico de mapache
    public Mapache(String name) {
        //llamando al constructor de la superclase
        super(name, 5, 4, 0);
        
        
        
    }

    @Override
    public void AtributosSolitario(String name, int attack, int life) {
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
