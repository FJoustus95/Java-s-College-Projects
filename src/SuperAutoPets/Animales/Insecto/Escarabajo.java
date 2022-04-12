
package SuperAutoPets.Animales.Insecto;

import SuperAutoPets.Animales.Animales;


public class Escarabajo extends Animales implements Insecto {
    
    //Pertenece a tier 1
    //Apetito: Otorga a las mascotas de la tienda +1/+2/+3 HP al comer comida de la tienda
    
    //constructor especifico de escarabajo
    public Escarabajo(String name) {
        //llamando al constructor de la superclase
        super(name, 2, 3, 0);
    }

    @Override
    public void AtributosInsecto(String name, int attack, int liffe) {
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
