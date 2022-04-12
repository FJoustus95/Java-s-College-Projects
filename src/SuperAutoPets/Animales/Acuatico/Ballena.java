
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Animales;


public class Ballena extends Animales implements Acuatico {
    
    //Pertenece a tier 4
    //Succión: Al iniciar la partida trague al aliado de delante y suéltalo como lvl 1/2/3 después de debilitarse

    
    //constructor especifico de ballena
    public Ballena(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 8, 0);
        
        
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
