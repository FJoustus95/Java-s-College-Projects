
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Acuatico.Acuatico;
import SuperAutoPets.Animales.Animales;


public class Castor extends Animales implements Terrestre, Acuatico {
    
    //Pertenece a tier 1
    //Represa: Da a 2 aliados al azar +1/+2/+3 HP al venderse
    
    //constructor especifico de castor
    public Castor(String name) {
        //llamando al constructor de la superclase
        super("Castor",2, 2, 0);
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosAcuatico(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int attack() {
        return (int) (2);
    }

    @Override
    public int life() {
        return (int) (2);
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
        return (String) ("Terrestre" + "/" + " Acuatico");
    }
    
}
