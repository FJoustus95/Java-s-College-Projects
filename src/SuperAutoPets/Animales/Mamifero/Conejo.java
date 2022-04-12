
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;


public class Conejo extends Animales implements Mamifero {
    
    //Pertenece a tier 3
    //Cariño: Cuando un amigo come comida de la tienda: Le da +1/ +2 / +3 HP
    
    //constructor especifico de conejo
    public Conejo(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 2, 0);
        
        
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
