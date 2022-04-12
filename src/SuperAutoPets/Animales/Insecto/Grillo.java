
package SuperAutoPets.Animales.Insecto;

import SuperAutoPets.Animales.Animales;


public class Grillo extends Animales implements Insecto {
    
    //Pertenece a tier 1
    //Zombificación: Convoca a un grillo zombie con estadísticas: (1/1)/(2/2)/(3/3) al morir.
    
    //constructor especifico de grillo
    public Grillo(String name) {
        //llamando al constructor de la superclase
        super(name, 1, 2, 0);
    }

    @Override
    public void AtributosInsecto(String name, int attack, int liffe) {
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
