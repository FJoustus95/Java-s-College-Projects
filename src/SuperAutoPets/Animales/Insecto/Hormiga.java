
package SuperAutoPets.Animales.Insecto;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Terrestre.Terrestre;

public  class Hormiga extends Animales implements Insecto, Terrestre {
    
    //Iteracion para almacenar el numero de mejoras/Habilidades
    public int numAtkUpgrades, numDeUpgrades;
    
    //Pertenece a tier 1
    //Compañerismo: Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir.
    
    //Constructor especifico de Hormiga
    
    public Hormiga(String name)  {
        //llamando al constructor de la superclase
        super(name, 2, 1, 0);
        
        
        
    }

    @Override
    public void AtributosInsecto(String name, int attack, int liffe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
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
