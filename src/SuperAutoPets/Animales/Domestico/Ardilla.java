
package SuperAutoPets.Animales.Domestico;

import SuperAutoPets.Animales.Animales;


public class Ardilla extends Animales implements Domestico {
    
    //Pertenece a tier 4
    //Rebajas: al iniciar el turno de compra realiza un descuento en la compra de alimentos por 1/2/3 de oro
    
    //constructor especifico de ardilla
    public Ardilla(String name) {
        //llamando al constructor de la superclase
        super(name, 2, 5, 0);
        
        
        
    }

    @Override
    public void AtributosDomestico(String name, int attack, int life) {
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
