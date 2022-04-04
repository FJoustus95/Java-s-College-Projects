
package SuperAutoPets.Animales.Solitario;

import SuperAutoPets.Animales.Terrestre.Terrestre;


public class Lobo implements Solitario, Terrestre{
    
    //Pertenece a tier 3
    //Aullido: Si es el último con vida gana (+2/+2)(+3,+3)(+5,+5) permanentemente
   
    public Lobo() {
        
        
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
