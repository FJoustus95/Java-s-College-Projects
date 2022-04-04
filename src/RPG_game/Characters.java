
package RPG_game;


public  abstract class Characters {
    
    //atributos de todos los personajes
    public String name;
    public int maxHp, hp, xp; //nota Hp = hit points
    
    //Contructor de los personajes
    public Characters( String name, int hp, int xp){
        this.name = name;
        this.hp = hp;
        this.xp = xp;
        
        
        
        
    }
    
    // metodos que cada personaje posee
    public abstract int attack();
    public abstract int defend();
    
}
