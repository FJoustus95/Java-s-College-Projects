
package SuperAutoPets.Animales.Domestico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Volador.Volador;


public class Pavoreal extends Animales implements Domestico, Volador{
    
    //Pertenece a tier 2
    //Potenciación: Gana 50% de ATK 1/ 2 / 3 veces al recibir daño
    
    //constructor especifico de pavoreal
    public Pavoreal(String name){
        //llamando al constructor de la superclse
        super(name, 2, 5, 0);
        
        
        
    }

    @Override
    public void AtributosDomestico(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosVolador(String name, int attack, int life) {
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
