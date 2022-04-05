
package RPG_game;


public class Enemy extends Characters{
    // variable para almacenar los Xp actuales de los jugadores
    
    int playerXp;
    
    // constructor especifico del enemigo
    
    public Enemy(String name, int playerXp) {
        
        super(name, (int) (Math.random()* playerXp + playerXp/3 + 5), (int) (Math.random() *(playerXp/ 4 + 2) +1 ));
        // asignando variable
        
        this.playerXp =playerXp;
        
    }

    // ataque especifico del enemigo y calculo de defensa
    
    @Override
    public int attack() {
        return (int) (Math.random()* (playerXp/4 + 1) + xp/4 + 3);
        
    }

    @Override
    public int defend() {
        return (int) (Math.random()* (playerXp/4 + 1) + xp/4 + 3) ;
        
    }
    
}
