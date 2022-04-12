
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Animales;


public  class Mosquito extends Animales implements Volador {
    
    //Pertenece a tier 1
    //Piquete inicial: Al iniciar batalla realiza 1 de daño a (1)/(2)/(3) enemigos
    
    //constructor especifico de mosquito
    public Mosquito(String name) {
        //llamando al constructor de la superclase
        super(name,2, 2, 0);
        
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
