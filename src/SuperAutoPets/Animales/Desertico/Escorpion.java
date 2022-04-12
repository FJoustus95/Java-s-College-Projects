
package SuperAutoPets.Animales.Desertico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Solitario.Solitario;


public class Escorpion extends Animales implements Desertico, Solitario {
    
    //Pertenece a tier 5
    //Aguja; tiene un ataque de veneno innato (el veneno ejecuta a la mascota enemiga sin importar cuánta vida tenga)
    
    //constructor especifico de escorpion
    public Escorpion(String name) {
        //llamando al constructor de la superclase
        super(name, 1, 1, 0);
        
    }

    @Override
    public void AtributosDesertico(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
