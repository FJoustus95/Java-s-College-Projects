package LordOfTheRings.src.org.ipc1.tlotr.character.heroes;

import LordOfTheRings.src.org.ipc1.tlotr.character.Characters;
import LordOfTheRings.src.org.ipc1.tlotr.util.Util;

public class Humanos extends Heroes {
    public Humanos(int life, int shield, String name) {
        super(life, shield, name);
    }

    @Override
    public int getModAttack(Characters defense){
        return 0;
    };


    private static String[] nombres = {"Aragon", "Baramir"};
    public static String getRandomName(){
        return Humanos.nombres[Util.generateRandomNumber(0, (nombres.length-1))];
    }
  
}
