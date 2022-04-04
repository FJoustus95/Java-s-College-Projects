
package SuperAutoPets.Animales.Reptil;

import SuperAutoPets.Animales.Solitario.Solitario;


public class Camaleon implements Reptil, Solitario {
    
    //Pertenece a tier 7 ( esta super roto el mono )
    //Habilidades por nivel
    //(1) Copia la vida del enemigo más fuerte
    // (2) Copia la vida y el daño del enemigo más fuerte
    // (3) Copia la vida, el daño y la habilidad del enemigo más fuerte
    
    public Camaleon() {
        
        
    }

    @Override
    public void AtributosReptil(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
