
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Acuatico.Acuatico;


public class Sapo implements Terrestre, Acuatico {
    
    //Pertenece a tier 2
    //Metamorfosis: Copia la salud del aliado más saludable
    
    public Sapo() {

    }

    @Override
    public void AtributosTerrestre(int attack, int life, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AtributosAcuatico(int attack, int life, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
