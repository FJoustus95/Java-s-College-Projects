
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Leopardo implements Terrestre, Mamifero {
    
    //Pertenece a tier 6
    //Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios 
    public Leopardo() {
        
        
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
