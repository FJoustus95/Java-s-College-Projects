
package SuperAutoPets.Animales.Desertico;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Camello implements Desertico, Mamifero {
    
    //Pertenece a tier 3
    //Joroba: Dar amigo detrás (+1/+2)/ (+2/+4) / (+3/+6)
    
    public Camello() {
        
    }

    @Override
    public void AtributosDesertico(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
