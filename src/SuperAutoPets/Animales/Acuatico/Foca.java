
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Foca extends Animales implements Acuatico, Mamifero {
    
    //Pertenece a tier 5
    //Compartir poder: Al recibir comida de la tienda da a 2 amigos randoms (+1/+1)(+2/+2)/(+3/+3)
   
    //constructor especifico de foca
    public Foca(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 8, 0);
        
    }

    @Override
    public void AtributosAcuatico(String name, int attack, int life) {
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
