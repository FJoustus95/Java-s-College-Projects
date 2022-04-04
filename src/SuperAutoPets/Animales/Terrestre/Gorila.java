
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Gorila implements Terrestre, Mamifero {
    
    //Pertenece a tier 6 ( como un low tier es top tier?? :=0 )
    //Escudo: al recibir daño gana escudo de coco ( 1/2/3 veces por batalla).
   
    public Gorila() {
        
        
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
