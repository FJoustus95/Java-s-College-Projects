
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Animales;


public class Buey extends Animales implements Mamifero{
    
    //Pertenece a tier 3
    //Mejor me protejo: gana armadura de melón y +2/ +4/ + 6 ATK cuando la mascota aliada de delante se debilita
    
    //constructor especifico de buey
    public Buey(String name){
        //llamando al constructor de la superclase
        super(name, 1, 4, 0);
        
        
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
