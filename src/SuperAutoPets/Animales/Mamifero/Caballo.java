
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Domestico.Domestico;


public class Caballo extends Animales implements Mamifero, Domestico {
    
    //Pertenece a tier 1
    //Rugido aliado: Da +1/+2/+3 ATK a los aliados invocados
    
    //constructor especifico de caballo
    public Caballo(String name) {
        //llamando al constructor de la superclase
        super("Caballo", 2, 1, 0);
        
    }

    @Override
    public void AtributosMamifero(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosDomestico(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int attack() {
        return (int) (2);
    }

    @Override
    public int life() {
        return (int) (1);
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
        return (String) ("Mamifero/Domestico");
    }
    
}
