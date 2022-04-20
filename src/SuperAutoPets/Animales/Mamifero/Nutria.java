
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;


public class Nutria extends Animales implements Mamifero {
    
    //Pertenece a tier 1
    //Ventaja económica: Da a un aliado aleatorio (+1/+1)/(+2/+2)/(+3/+3) al comprarse
    
    //constructor especifico de nutria
    public Nutria(String name) {
        //llamando al constructor de la superclase
        super("Nutria", 1, 2, 0);
        
        
    }

    @Override
    public void AtributosMamifero(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int attack() {
        return (int) (1);
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
        return (String) "Nutria"; 
    }
    
}
