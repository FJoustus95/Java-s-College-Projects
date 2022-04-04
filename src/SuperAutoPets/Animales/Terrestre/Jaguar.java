
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Jaguar implements Terrestre, Mamifero {
    
    //Pertenece a tier 5
    //Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15) de daño
    
    public Jaguar() {
        
        
        
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
