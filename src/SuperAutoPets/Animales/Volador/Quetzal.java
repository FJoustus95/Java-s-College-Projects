
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Solitario.Solitario;


public class Quetzal implements Volador, Solitario{
    
    //Pertenece a tier 7 (Literalmente es top tier)
    //(1) Agrega a su vida la suma de toda la vida de los animales tipos aves 
    //(2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de todas las aves.
    //(3) Hace lo del nivel 2 pero con todos los animales.
    
    public Quetzal () {
        
        
        
    }

    @Override
    public void AtributosVolador(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
