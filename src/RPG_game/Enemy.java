
package RPG_game;


public class Enemy extends Characters{
    
    int playerXp;
    public Enemy(String name, int hp, int xp) {
        super(name, hp, xp);
    }

    // ataque especifico del enemigo y calculo de defensa
    
    @Override
    public int attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
