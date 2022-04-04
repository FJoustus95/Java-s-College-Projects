
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Mamifero.Mamifero;
import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Mamut implements Solitario, Terrestre, Mamifero{
   
    //Pertenece a tier 6
    //Fuerza compañeros: al desmayarse dará a todos los amigos (+2/+2)/ (+4/+4) / (+6/+6) 
    
    public Mamut() {
        
        
        
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
