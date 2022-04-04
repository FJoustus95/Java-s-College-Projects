
package SuperAutoPets.Animales.Acuatico;

import SuperAutoPets.Animales.Solitario.Solitario;


public class Pulpo implements Acuatico, Solitario {
    
    //Pertenece a tier 6
    //Habilidades por nivel

    // (1) Subir de nivel: Gana +8/8.
    // (2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar.
    // (3) Antes del ataque: inflige 5 de daño a todos los enemigos.
    
    public Pulpo() {
      
      
  }  

    @Override
    public void AtributosAcuatico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosSolitario(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
