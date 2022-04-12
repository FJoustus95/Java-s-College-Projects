
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Animales;


public class Delfin extends Animales implements Acuatico {
    
    //Pertenece a tier 4
    //Salpicón: reparte 5/10/15 de daño al enemigo con la salud más baja al comenzar la batalla.
    
    //constructor especifico de delfin
    public Delfin(String name) {
        //llamando al constructor de la superclase
        super(name, 4, 6, 0);
        
        
    }

    @Override
    public void AtributosAcuatico(String name, int attack, int life ) {
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
