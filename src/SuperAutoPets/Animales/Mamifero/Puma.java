
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Puma implements Mamifero, Terrestre {
    
    //Pertenece a tier 4
    //Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la copia el puede atacar.
   
    public Puma() {
        
        
    }

    @Override
    public void AtributosMamifero(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
