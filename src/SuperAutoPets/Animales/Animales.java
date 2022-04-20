
package SuperAutoPets.Animales;

//Clase astracta de los Animales 
public  abstract  class  Animales extends Object {

    public int attack, life, maxLife,xp, eachEffectAnimal, eachAbilityAnimal, level;
    public String name, types;
    
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
    
    public boolean isAlive() {
        return this.life > 0;
    
    //getters y setters de los atributos de los animales    
    }
    
    //falta de completar el vector NOTA
    //metodo especifico de ataque
    //AAFDSÑASDFJKLSÑAHFASKJ

    //@Override
    public int getAttack(Animales otros) {
       // int atk = (int) (Math.random() * (xp/4 + ))
        return attack;
    }
    public boolean isDead() {
        if (this.life <= 0) {
            return true;
        } else {
        return false;
        
        
        }
    }   
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getEachEffectAnimal() {
        return eachEffectAnimal;
    }

    public void setEachEffectAnimal(int eachEffectAnimal) {
        this.eachEffectAnimal = eachEffectAnimal;
    }

    public int getEachAbilityAnimal() {
        return eachAbilityAnimal;
    }

    public void setEachAbilityAnimal(int eachAbilityAnimal) {
        this.eachAbilityAnimal = eachAbilityAnimal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }
    
    public int getLevel() {
        return level;
    }

    //metodo que obtiene el estatus de cada animal
    public String status() {
        return name + " con ataque " + attack  + " tiene "  +  life + "/" + maxLife + "Salud";
        
    //metodo que actualiza los datos de cada animal    
    }
    @Override
    public String toString () {
        return  getName()  + "nivel" + getLevel() + " vida " + getLife() + ((this.isAlive()) ? "esta vivo" : " esta muerto");
        
        
    }
    
    
    }
    

