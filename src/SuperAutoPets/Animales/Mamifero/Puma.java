
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Puma extends Animales implements Mamifero, Terrestre {
    
    //Pertenece a tier 4
    //Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la copia el puede atacar.
    
    //constructor especifico de puma
    public Puma(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 7, 0);
        
        
    }

    @Override
    public void AtributosMamifero(String name, int attack, int life) {
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
