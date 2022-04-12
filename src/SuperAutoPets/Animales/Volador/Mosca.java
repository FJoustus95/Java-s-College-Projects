
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Insecto.Insecto;


public class Mosca extends Animales implements Volador, Insecto {
    
    //Pertenece a tier 6
    //Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en su lugar (tres veces por batalla).
    
    //constructor especifico de mosca
    public Mosca(String name) {
        //llamando al constructor de la superclase
        super(name, 5, 5, 0);
        
        
        
        
    }

    @Override
    public void AtributosVolador(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
