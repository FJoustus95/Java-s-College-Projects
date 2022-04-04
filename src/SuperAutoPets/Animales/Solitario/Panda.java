
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Panda implements Solitario, Mamifero {
    
    //Pertenece a tier 6
    //Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido
    
    public Panda () {
        
        
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
