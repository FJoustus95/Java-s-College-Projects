
package SuperAutoPets.Animales.Mamifero;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Jirafa implements Mamifero, Terrestre {
    
    //Pertenece a tier 3
    //Fortaleza aliada: Da 1/ 2 / 3 amigos por delante +1/+1 al finalizar el turno de compra
    
    public Jirafa(){
        
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
