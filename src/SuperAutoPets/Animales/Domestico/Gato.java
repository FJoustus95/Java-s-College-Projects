
package SuperAutoPets.Animales.Domestico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Gato extends Animales implements Domestico, Mamifero {
   
    //Pertenece a tier 6
    //Maullido: Multiplica el efecto HP y ATK de la comida por 2/3/4
    
    //constructor especifico de gato
    public Gato(String name) {
        //llamando al constructor de la superclase
        super(name, 4, 5, 0);
       
       
   } 

    @Override
    public void AtributosDomestico(String name, int attack, int life) {
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
