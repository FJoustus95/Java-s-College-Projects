
package SuperAutoPets.Animales.Reptil;

import SuperAutoPets.Animales.Animales;


public class Tortuga extends Animales implements Reptil {
        
    //Pertenece a tier 3
    //Protección aliada: Dar 1/2/3 amigos detrás de Melón Armor al morir
       
    //constructor especifico de tortuga
    public Tortuga(String name) {
        //llamando al constructor de la superclase
        super(name, 1, 2, 0);
        
            
            
            
        }
    @Override
    public void AtributosReptil(String name, int attack, int life) {
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
