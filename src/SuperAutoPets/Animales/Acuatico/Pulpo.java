
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Solitario.Solitario;


public class Pulpo extends Animales implements Acuatico, Solitario {
    
    //Pertenece a tier 6
    //Habilidades por nivel

    // (1) Subir de nivel: Gana +8/8.
    // (2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar.
    // (3) Antes del ataque: inflige 5 de daño a todos los enemigos.
    
    //constructor especifico de pulpo
    public Pulpo(String name) {
        //llamando al constructor de la superclase
        super(name, 8, 8, 0);
      
      
  }  

    @Override
    public void AtributosAcuatico(String name, int attack, int life) {
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
