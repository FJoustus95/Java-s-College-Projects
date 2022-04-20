
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Acuatico.Acuatico;
import SuperAutoPets.Animales.Animales;


public class Sapo extends Animales implements Terrestre, Acuatico {
    
  
    
    //Pertenece a tier 2
    //Metamorfosis: Copia la salud del aliado más saludable
    
    //constructor especifico de sapo
    public Sapo(String name) {
        //llamando al constructor de la superclase
        super("Sapo", 3, 3, 0);

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
        return (int) (3);
    }

    @Override
    public int life() {
        return (int) (3);
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
        return
    }
    
}
