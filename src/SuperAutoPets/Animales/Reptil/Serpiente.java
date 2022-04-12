
package SuperAutoPets.Animales.Reptil;

import SuperAutoPets.Animales.Animales;
import SuperAutoPets.Animales.Desertico.Desertico;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Serpiente extends Animales implements Reptil, Terrestre, Desertico {
    
    //Pertenece a tier 6 ( top tier de seguro se la pasa spameando puro b xd )
    //Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota aliada de delante ataca
    
    //constructor especifico de serpiente
    public Serpiente(String name) {
        //llamando al constructor especifico de la superclase
        super(name, 6, 6, 0);
        
        
    }

    @Override
    public void AtributosReptil(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(String name, int attack, int life) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosDesertico(String name, int attack, int life) {
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
