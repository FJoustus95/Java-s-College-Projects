
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;


public class Mono extends Animales implements Mamifero {
    
    //Pertenece a tier 5 ( es high tier xd )
    // Nota : durante el turno final el monkey flip puede realizar su tecnica
    //Amistad: Dar al amigo más a la derecha (+2/+3)/ (+4/+6) / (+6/+9)
   
    //constructor especifico de mono
    public Mono(String name) {
        //llamando al constructor de la superclase
        super(name, 1, 2, 0);
        
        
        
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
