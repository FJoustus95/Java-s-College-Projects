package LordOfTheRings.src.org.ipc1.tlotr;

import LordOfTheRings.src.org.ipc1.tlotr.character.Characters;

public class Game extends Object {

    /**
     * Se encarga de la jugabilidad
     */
    public void play(){
        Characters ch1 = new Characters(100, 30, "Rene"); // espacio 100
        Characters ch2 = new Characters(100, 30, "JBalvin"); // espacio 200
        
        //100    attack      200
        //oliver.attack(nicolas);
        ch1.attack(ch2);
        ch2.attack(ch1);

        System.out.println("Oliver gana :D au au au");
        
    }
    
}
