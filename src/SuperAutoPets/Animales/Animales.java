
package SuperAutoPets.Animales;

//Clase astracta de los Animales 
public  abstract class Animales extends Object {

    int attack, life, maxLife,xp, eachEffectAnimal, eachAbilityAnimal;
    String name, types;
    
    //Unico constructor de todos los animales
    public Animales(String name,int attack, int maxLife,int xp ){
    
        this.name =  name;
        this.attack = attack;
        this.maxLife = maxLife;
        this.xp = xp;
        
         
        
        
    }
    //metodo que cada animal posee
    
    public abstract int attack();
    public abstract int life();
    public abstract int eachEffectAnimal();
    public abstract int eachAbilityAnimal();
    public abstract String types();
    
    

    
}
