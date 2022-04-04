
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Tigre implements Terrestre, Mamifero {
    
    //Pertenece a tier 6
    //Repetición: El amigo de adelante repite su habilidad en la batalla como si fuera de nivel
    
    public Tigre() {
        
        
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
