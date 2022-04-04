package LordOfTheRings.src.org.ipc1.tlotr.character.beasts;

import LordOfTheRings.src.org.ipc1.tlotr.character.Characters;

public class Orcs extends Beasts {
    public Orcs(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getModAttack(Characters defense){
        return 0;
    };
    
    @Override
    public int getModDefense(Characters attack){
        return 0;
    };
}
