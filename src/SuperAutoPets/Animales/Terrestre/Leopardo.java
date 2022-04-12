
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Leopardo extends Animales implements Terrestre, Mamifero {
    
    //Pertenece a tier 6
    //Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios 
    
    //constructor especifico de leopardo
    public Leopardo(String name) {
        //llamando al constructor de la superclase
        super(name, 10, 4, 0);
        
        
        
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(String name, int attack, int life) {
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
