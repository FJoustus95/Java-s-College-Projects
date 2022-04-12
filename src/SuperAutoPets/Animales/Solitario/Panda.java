
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Panda extends Animales implements Solitario, Mamifero {
    
    //Pertenece a tier 6
    //Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido
    
    //constructor especifico de panda
    public Panda (String name) {
        //llamando al constructor de la superclase
        super(name, 5, 5, 0);
        
        
    }

    @Override
    public void AtributosSolitario(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(String name, int attack, int life) {
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
