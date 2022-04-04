
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Foca implements Acuatico, Mamifero {
    
    //Pertenece a tier 5
    //Compartir poder: Al recibir comida de la tienda da a 2 amigos randoms (+1/+1)(+2/+2)/(+3/+3)
   
    public Foca() {
        
        
    }

    @Override
    public void AtributosAcuatico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
