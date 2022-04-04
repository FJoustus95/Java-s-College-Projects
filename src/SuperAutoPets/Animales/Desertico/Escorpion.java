
package SuperAutoPets.Animales.Desertico;

import SuperAutoPets.Animales.Solitario.Solitario;


public class Escorpion implements Desertico, Solitario {
    
    //Pertenece a tier 5
    //Aguja; tiene un ataque de veneno innato (el veneno ejecuta a la mascota enemiga sin importar cuánta vida tenga)
    
    public Escorpion() {
        
        
    }

    @Override
    public void AtributosDesertico(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
