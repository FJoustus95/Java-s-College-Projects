
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;


public class Venado extends Animales implements Mamifero {
    
    // Pertenece a tier 4
    //Venganza: Invoca un (5/5)/(10/10)/(15/15) autobus con Splash attack al morir
    
    //constructor especifico de venado
    public Venado(String name){
        // llamando al constructor de la superclase
        super(name, 1, 1, 0);
        
        
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
