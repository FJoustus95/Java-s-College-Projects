
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Animales;


public  class Pescado extends Animales implements Acuatico {
    
    //Pertenece a tier 1
    //Power-up: Da a todos los aliados (+1/+1)/(+2/+2) al subir de nivel
    
    //contructor especifico de pescado
    public Pescado(String name) {
        
        //llamando al constructor de la superclase
        super(name,2, 3, 0);
        
    }

    @Override
    public void AtributosAcuatico(String name, int attack, int life) {
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
