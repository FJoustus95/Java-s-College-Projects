
package SuperAutoPets.Animales.Domestico;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Gato implements Domestico, Mamifero {
   
    //Pertenece a tier 6
    //Maullido: Multiplica el efecto HP y ATK de la comida por 2/3/4
    
    public Gato() {
       
       
   } 

    @Override
    public void AtributosDomestico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
