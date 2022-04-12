
package SuperAutoPets.Animales.Reptil;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Solitario.Solitario;


public class Camaleon extends Animales implements Reptil, Solitario {
    
    //Pertenece a tier 7 ( esta super roto el mono )
    //Habilidades por nivel
    //(1) Copia la vida del enemigo más fuerte
    // (2) Copia la vida y el daño del enemigo más fuerte
    // (3) Copia la vida, el daño y la habilidad del enemigo más fuerte
    
    //constructor especifico de camaleon
    public Camaleon(String name) {
        //llamando al constructor de la superclase
        super(name, 8, 8, 0);
        
        
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
