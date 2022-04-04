
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Domestico.Domestico;


public class Caballo implements Mamifero, Domestico {
    
    //Pertenece a tier 1
    //Rugido aliado: Da +1/+2/+3 ATK a los aliados invocados
    
    public Caballo() {
 
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosDomestico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
