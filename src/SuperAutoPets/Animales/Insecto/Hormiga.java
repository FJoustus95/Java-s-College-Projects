
package SuperAutoPets.Animales.Insecto;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Terrestre.Terrestre;

public final class Hormiga extends Animales implements Insecto, Terrestre {
    
    //Iteracion para almacenar el numero de mejoras/Habilidades
    public int numAtkUpgrades, numDeUpgrades;
    
    //Pertenece a tier 1
    //Compañerismo: Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir.
    public Hormiga("Hormiga", 2, 1 ) {
        
    }

    @Override
    public void AtributosInsecto(int attack, int liffe, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
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
