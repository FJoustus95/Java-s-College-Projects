
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Jaguar extends Animales implements Terrestre, Mamifero {
    
    //Pertenece a tier 5
    //Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15) de daño
    
    //constructor especifico de jaguar
    public Jaguar(String name) {
        //llamando al constructor de la superclase
        super(name, 7, 4, 0);
        
        
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
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
