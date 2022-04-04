
package SuperAutoPets.Animales.Terrestre;

import SuperAutoPets.Animales.Mamifero.Mamifero;


public class Canguro implements Terrestre, Mamifero {
    
    //Pertenece a tier 3
    //Ya quiero pelear: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) cada que la mascota aliada de delante ataque
    
    public Canguro() {
        
        
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
