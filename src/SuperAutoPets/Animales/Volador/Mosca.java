
package SuperAutoPets.Animales.Volador;

import SuperAutoPets.Animales.Insecto.Insecto;


public class Mosca implements Volador, Insecto {
    
    //Pertenece a tier 6
    //Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en su lugar (tres veces por batalla).
    public Mosca() {
        
        
        
    }

    @Override
    public void AtributosVolador(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosInsecto(int attack, int liffe, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
