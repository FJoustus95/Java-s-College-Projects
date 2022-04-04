
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Vaca implements Terrestre, Mamifero {
    
    //Pertenece a tier 5
    //Leche potenciadora: al comprar reemplaza la tienda de comida con leche gratis que da (+1/+2)/ (+2/+4) / (+3/+6) 
    
    public Vaca() {
        
        
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
