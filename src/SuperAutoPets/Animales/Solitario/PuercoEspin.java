
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Animales;


public class PuercoEspin extends Animales implements Solitario {
    
    //Pertenece a tier 2 ( the hedhedog xd )
    //Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir
    
    //constructor especifico de puercoespin
    public PuercoEspin(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 2, 0);
        
    }

    @Override
    public void AtributosSolitario(String name, int attack, int life) {
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
