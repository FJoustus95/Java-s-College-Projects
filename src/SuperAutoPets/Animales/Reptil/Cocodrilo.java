
package SuperAutoPets.Animales.Reptil;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Solitario.Solitario;


public class Cocodrilo extends Animales implements Reptil, Solitario {
    
    //Pertenece a tier 5 ( what como un low tier es high tier??? )
    //Estampida: Inflige 4/8/12 de daño al primer enemigo.
    
    //constructor especifico de cocodrilo
    public Cocodrilo(String name) {
        //llamando al constructor de la superclase
        super(name, 8, 4, 0);
        
        
    }

    @Override
    public void AtributosReptil(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
