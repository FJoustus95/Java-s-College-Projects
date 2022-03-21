package LordOfTheRings.src.org.ipc1.tlotr.character;

public class Characters {

    private int life;
    private int shield;
    private String name;

    public Characters(int life, int shield, String name) {
        this.life = life;
        this.shield = shield;
        this.name = name;
    }

    public boolean isAlive(){
        return life>0;
    }

    @Override
    public String toString() {
        return "El personaje " + getName() + " tiene vida " +
             getLife() + " y un escudo de " + getShield() ;
    }

                        // this = oliver
    public void attack(Characters p2){
                       // p2 = nicolas
        System.out.println("********Inicia la pelea");
        System.out.println("              "+this.getName()+" ataca a "+p2.getName());
        // random para el ataque de dos dados
        //verificar modificadores de ataque
        //nicolas.defend(oliver,5);
        p2.defend(this, 5);

        System.out.println("Termino el ataque");
        System.out.println("Atacante: "+this.toString());
        System.out.println("Defensor: "+p2.toString());
        
    }
    
    //this=nicolas             p1=oliver
    public void defend(Characters p1, int attackAmount){
        //modificador para la defensa
        System.out.println("              "+this.getName()+" se defiende de "+p1.getName());
        
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getShield() {
        return this.shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    
}
