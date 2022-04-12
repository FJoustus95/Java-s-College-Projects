
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Solitario.Solitario;


public class Quetzal extends Animales implements Volador, Solitario{
    
    //Pertenece a tier 7 (Literalmente es top tier)
    //(1) Agrega a su vida la suma de toda la vida de los animales tipos aves 
    //(2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de todas las aves.
    //(3) Hace lo del nivel 2 pero con todos los animales.
    
    //constructor especifico de quetzal
    public Quetzal (String name) {
        //llamando al constructor de la superclase
        super(name, 10, 10, 0);
        
        
        
        
    }

    @Override
    public void AtributosVolador(String name, int attack, int life) {
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
