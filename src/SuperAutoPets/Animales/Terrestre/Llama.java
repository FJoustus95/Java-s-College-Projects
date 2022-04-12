
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Animales;


public class Llama extends Animales implements Terrestre {
    
    //Pertenece a tier 4
    //Fortaleza individual: al finalizar el turno de compra si tienes 4 mascotas o menos, gana (+2/+2)/ (+4/+4) / (+6/+6)
    
    //constructor especifico de llama
    public Llama(String name) {
        //llamando al constructor de la superclase
        super(name, 3, 6, 0);
        
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
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
