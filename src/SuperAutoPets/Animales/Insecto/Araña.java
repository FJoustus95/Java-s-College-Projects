
package SuperAutoPets.Animales.Insecto;

import SuperAutoPets.Animales.Animales;


public class Araña extends Animales implements Insecto {
    
    //Pertenece a tier 2
    //Liberación: invoca una mascota de nivel 1/2/3 de nivel 3 como 2/2 al morir
    
    //constructor especifico de araña
    public Araña(String name) {
        //llamando al constructor de la superclase
        super(name, 2, 2, 0);
        
        
        
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
