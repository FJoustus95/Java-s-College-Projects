
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Elefante implements Mamifero, Terrestre{
    
    //Pertenece a tier 2
    //Daño colateral: Inflige 1 daño a 1/2/3 amigos detrás antes de atacar
    
    public Elefante() {
        
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
