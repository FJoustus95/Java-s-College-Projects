
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Animales;


public class Loro extends Animales implements Volador{
    
    //Pertenece a tier 4
    //Copia: al finalizar el turno de compra copia la habilidad del amigo de adelante como lvl 1/2/3 hasta el final de la batalla
   
    //constructor especifico de loro
    public Loro(String name) {
        //llamando al constructor de la superclase
        super(name, 5, 3, 0);
        
        
        
    }

    @Override
    public void AtributosVolador(String name, int attack, int life) {
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
