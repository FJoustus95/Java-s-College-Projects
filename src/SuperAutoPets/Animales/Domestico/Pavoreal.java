
package SuperAutoPets.Animales.Domestico;

import SuperAutoPets.Animales.Volador.Volador;


public class Pavoreal implements Domestico, Volador{
    
    //Pertenece a tier 2
    //Potenciación: Gana 50% de ATK 1/ 2 / 3 veces al recibir daño
    
    public Pavoreal(){
        
        
    }

    @Override
    public void AtributosDomestico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosVolador(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
