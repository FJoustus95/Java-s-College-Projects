
package RPG_game;
    import java.util.Scanner;

public class GameLogic {
    static Scanner leer = new Scanner(System.in);
    
    static Player player;
    public static boolean isRunning;
    
    //Peleas aleatorias
    public static String[] encounters = {"Battle", "Battle", "Battle", "Rest", "Rest"};
    
    //nombre de los enemigos
    public static String[] enemies = {"Ogre", "Ogre", "Goblin", "Goblin", "Stone elemental"};
    
    
    //Elementos de la historia
    public static int place = 0, act = 1;
    public static String[] places = {"Everlasting Mountains", "Haunted chase", "Castle of the evil emperor", "Throne Room"};
    
    
    
    //metodo que consigue la entrada del usuario desde consola
    public static int readInt (String disponible, int EleccionUsuario){
        int input;
        do{
            System.out.println(disponible);
            try{
                input =Integer.parseInt(leer.next());
                
            }catch( Exception e){
                input =-1;
                System.out.println("Escriba un numero entero positivo dentro del rango");
                
                
                
            }
            
            
        } while ( input < 1 || input > EleccionUsuario );
        
     return input;   
    }
    //Metodo que simula limpiar la consola
    public static void limpiarConsola(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
            
            
        }
        
        
    }
    
    // metodo para imprimir un separador con longitud n veces
    public static void imprimirSeparador (int n){
        for (int i = 0; i < n ; i++) 
            System.out.print("-");
            
            System.out.println();
            
        
     } 
     
    
    //metodo para imprimir titulo
    public static void imprimirTitulo(String titulo) {
        
       imprimirSeparador(30);
        System.out.println(titulo);
       imprimirSeparador(30);
       
       
    }
     //metodo para parar el juego cuando el usuario ingrese cualquier cosa
    public static void anythingToContinued() {
        System.out.println("\nEntre cualquier cosa para continuar");
        leer.next();
        
        
        
    }
    //metodo para iniciar el juego
    public static void Startgame(){
        boolean nameSet = false;
        String name;
        
        //imprimir pantalla de titulo
        limpiarConsola();
        imprimirSeparador(40);
        imprimirSeparador(30);
        
        System.out.println(" AGE OF THE EVIL EMPEROR");
        imprimirSeparador(30);
        imprimirSeparador(40);
        
        
        System.out.println();
        System.out.println("Made by Fredy Jacob");
        imprimirSeparador(30);
        imprimirSeparador(40);
        
        anythingToContinued();
        
        //Obteniendo el nombre del jugador
        do{
           limpiarConsola();
           imprimirTitulo("Cual es tu nombre?");
           name = leer.next();
        
        //preguntandole al jugador si el nombre esta correcto
        limpiarConsola();
        imprimirTitulo("Tu nombre es " + name + " \nes correcto??");
            System.out.println("1) Si ");
            System.out.println("2) No, quiero cambiarlo ");
            int input = readInt(" -> ", 2);
            if (input == 1)
                nameSet = true;
               
        } while(!nameSet);
        
        //Imprimir la intro de la historia
        Story.imprimirIntro();
        
        //creando nuevo jugador objeto con el nombre
        
        player = new Player (name);
        
        //Ajuste si estaCorriendo es verdadero, entonces el loop del juego puede continuar
        isRunning = true;
        
        
        //Empezar main game loop 
        gameLoop();
        
            
        
            
            
        
        
    } //metodo que cambia los valores bases y experiencia del jugador del juego
    public static void checkAct(){
        //cambia el acto basado en xp
        if (player.xp >= 10 && act ==1 ) {
            
            //incrementa en acto y el lugar
            act = 2;
            place = 1;
            
            //Historia
            Story.imprimirPrimerACTOutro();
            //Dejar que el jugador suba de nivel
            player.escogerRasgo();
            
            //Historia
            Story.imprimirSecACTIntro();
            
            //Asignando nuevos valores de los enemigos
            enemies[0] ="Evil Mercenary";
            enemies[1] = "Goblin";
            enemies[2] = "Wolve Pack";
            enemies[3] = "Henchman of the evil emperor";
            enemies[4] = "Scary Stranger";
            
            //Asignado nuevos valores de los enfrentamientos
            
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Rest";
            encounters[4] = "Shop";
            
            //Llenando la salud del jugador
            player.hp = player.maxHp;
            
            
            
            
        }else if(player.xp >= 50 && act ==2) {
            //Incrementar acto y lugar
            act =3;
            place = 2;
            
            //Historia
            Story.imprimirSecACTOutro();
            //Sube de Nivel
            player.escogerRasgo();
            
            //Historia
            Story.imprimirThirdACTIntro();
            
            //Asignando nuevos valores a los enemigos
            enemies[0] ="Evil Mercenary";
            enemies[1] = "Goblin";
            enemies[2] = "Henchman of the evil emperor";
            enemies[3] = "Henchman of the evil emperor";
            enemies[4] = "Henchman of the evil emperor";
            
            //Asignando nuevos valores a los enfrentamientos
            
            encounters[0] = "Battle";
            encounters[1] = "Battle";
            encounters[2] = "Battle";
            encounters[3] = "Battle";
            encounters[4] = "Shop";
             
            //Llenando la salud del jugador
            player.hp = player.maxHp;
            
        }else if(player.xp >= 100 && act ==3) {
            //Incrementar el acto y el lugar
            act = 4;
            place = 3;
            
            //Historia
            Story.imprimirThirdACTOutro();
            //Sube de nivel
            player.escogerRasgo();
            
            //Historia
            Story.imprimirFourACTIntro();
            
            //Llenando la salud del jugador
            player.hp = player.maxHp;
            
            //Llamando al enfrentamiento final
            finalBattle();
            
        }
        
        
    }
    
    //Metodo que calcula un enfrentamiento aleatorio
    public static void randomEncounter() {
        
        // numero aleatorio entre 0 a la longitud de enfrentamientos
        
        int encounter = (int) (Math.random()* encounters.length);
        
        // llamando a los respectivos metodos
        if (encounters[encounter].equals("Battle")){
            randomBattle();
            
            // batallaAleatoria();
        } else if (encounters[encounter].equals("Descanso")){
            takeRest();
            //tomarUnDescanso();
            
        } else {
            //tienda();
            shop();
        }
        
    }
    
        //Metodo que continua el viaje 
    public static void continuarViaje(){
        //Verificar si debe aumentar el acto
        checkAct();
        
        //Verificar si no es el ultimo acto
        if(act != 4)
            randomEncounter();
        
        
    }
    //imprimir la informacion mas importante sobre el personaje del jugador
    public static void informacionPersonaje() {
        limpiarConsola();
        imprimirTitulo("Informacion sobre el Personaje");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        imprimirSeparador(20);
        
        // experiencia y oro del jugador
        System.out.println("XP: " + player.xp + "\tGold: " + player.gold);
        imprimirSeparador(20);
        
        // numero de pociones (pots)
        System.out.println("No. de pociones: " + player.pots);
        imprimirSeparador(20);
        
        
        
        
        //Imprimir los rasgos seleccionados
        if(player.numAtkUpgrades > 0) {
            System.out.println("Rasgos de ataque: " + player.mejorAtaque[player.numAtkUpgrades -1]);
            imprimirSeparador(20);
               
        }
        if (player.numDeUpgrades > 0) {
            System.out.println("Rasgos de defensa" + player.mejoraDefensa[player.numDeUpgrades -1]);
            imprimirSeparador(20);
            
        }
        anythingToContinued();
    }
    // tienda o encontrandose con un vendedor ambulante
    public static void shop() {
        limpiarConsola();
        imprimirTitulo("Te encontraste a un misterioso extraño\nEl te ofrece algo: ");
        int price = (int) (Math.random()* (10 + player.pots*3) + 10 + player.pots);
        System.out.println("- Pocion Magica: " + price + " oro ");
        imprimirSeparador(20);
        
        //preguntarle al jugador para comprar uno
        System.out.println("Quieres comprar una?\n1) Si claro\n2) No gracias XD");
        int input = readInt("->" , 2);
        
        //chequear si el jugador quiere comprar uno
        if (input ==1) {
            limpiarConsola();
            
            //revisar si el jugador tiene dinero suficiente
            if (player.gold >= price) {
                
                imprimirTitulo("Tu compraste una pocion magica de " + price + " oro ");
                player.pots++;
                player.gold -= price;
     
            }else
            imprimirTitulo("No tienes suficiente dinero para comprar esto");
            anythingToContinued();
            
            
            
        }
        
    }
    //Tomando un descanso
    public static void takeRest() {
        limpiarConsola();
        if (player.restsLeft >= 1) {
            imprimirTitulo("Quieres tomar un descanso??? (" + player.restsLeft + " descanso restantes)");
            System.out.println("1) Si\n2) No gracias");
            int input = readInt("->" , 2);
            if(input ==1) {
                
                //jugador realmente toma un descanso
            
            limpiarConsola();
            if (player.hp < player.maxHp) {
                int hpRestored = (int) (Math.random() * (player.xp/4 +1 ) + 10);
                player.hp +=hpRestored;
                if(player.hp > player.maxHp)
                    player.hp = player.maxHp;
                System.out.println("Tomaste un descanso y restauraste " + hpRestored + " Salud ");
                System.out.println("Tu estas ahora " + player.hp + "/" + player.maxHp + " Salud");
                player.restsLeft--;
                   
            }
    
           } else
                System.out.println("Tienes completa la energia, no necesitas descansar");
            anythingToContinued();
            
            
        }
        
        
    }
    //creando una batalla aleatoria
    public static void randomBattle() {     
     limpiarConsola();
     imprimirTitulo("Tu encontraste una criatura malvada, tendras que pelear!!!!!!");
     anythingToContinued();
     
     // creando un nuevo enemigo con un nombre aleatorio
     battle(new Enemy(enemies[(int) (Math.random()*enemies.length)], player.xp));
     
     
    
    
    }
    //metodo principal de la batalla
    public static void battle(Enemy enemy){
        
        //loop de la batalla principal
        while (true) {
            limpiarConsola();
            imprimirTitulo(enemy.name + "\nHP: " + enemy.hp + "/" + enemy.maxHp);
            imprimirTitulo(player.name + "\nHP: " + player.hp + "/" + player.maxHp);
            System.out.println("Escoja una opcion: ");
            imprimirSeparador(20);
            System.out.println("1) Pelear\n2) Usar pocion\n3) Correr ");
            int input = readInt("->" ,3);
            
            //leyendo la entrada del jugador
            if(input == 1) {
                
                //Pelear
                //Calcular el daño y daño tomado 
             int dmg = player.attack() - enemy.defend();
             int dmgTook = enemy.attack() + player.defend();
             
             //revisando que el daño y daño tomado no sean negativos
             if (dmgTook < 0) {
                 
             //agregar algo de daño si el jugador defiende muy bien
             dmg -= dmgTook/2;
             dmgTook = 0;
             
                 
             }
             if (dmg < 0)
                dmg = 0;
             
             //trato peligroso a ambas partes
             player.hp -= dmgTook;
             enemy.hp -= dmg;
             
             //imprimir informacion de esta ronda
             limpiarConsola();
             imprimirTitulo("Batalla");
                System.out.println("Trataste " + dmg + "dañar a " + enemy.name + ".");
             imprimirSeparador(15);
                System.out.println("El " + enemy.name + " trata " + dmgTook + " dañarte ");
                anythingToContinued();
                
                //revisando si el jugador esta vivo o muerto
             if(player.hp <= 0) {
                 playerDied(); //metodo del final de juego
                 
                 break;
                     
             }else if( enemy.hp <= 0) {
                 //decirle al jugador que gano la batalla
             limpiarConsola();
             imprimirTitulo("Tu venciste  al " + enemy.name + "!!!!");
             
             //incrementa el xp del jugador
              player.xp += enemy.xp;
                 System.out.println("Tu ganaste " + enemy.xp + " XP!");
                 
                 //gotas aleatorias
                 boolean addRest = (Math.random()*5 + 1 <= 2.25);
                 int goldEarned = (int) (Math.random()*enemy.xp);
                 
                 if(addRest) {
                     player.restsLeft++;
                     System.out.println("Ganaste la posibilidad de tener un descanso adicional!");
                     
                 }
                 if(goldEarned > 0) {
                     player.gold += goldEarned;
                     System.out.println("Tu recolectas " + goldEarned + " oro del enemigo " + enemy.name + " muerto!" );
                     
                     
                     
                 }
                 anythingToContinued();
                 break;
                 
                 
                 
             }  
            } else if (input ==2 ){
               //usar pocion
               
               limpiarConsola();
               if (player.pots > 0 && player.hp < player.maxHp) {
               // el jugador puede tomar una pocion
               //asegurarse que el jugador quiera beber la pocion
               
               imprimirTitulo("Quires tomar una pocion?? (" + player.pots + " restante)");
                   System.out.println("1) Si\n2) Talvez luego");
                   input = readInt("->" ,2);
                   
                   if (input == 1) {
                       //jugador realmente lo tomo
                       player.hp = player.maxHp;
                       limpiarConsola();
                       imprimirTitulo("Bebiste una pocion magica, Se restaurara tu salud a " + player.maxHp);
                       anythingToContinued();
                       
                       
                   }
                   
                   
               }
               
            } else {
                //correr
                
                limpiarConsola();
                
                //revisar que el jugador no este en el ultimo acto ( pelea final )
                if ( act != 4) {
                    //35% probabilidad para escapar
                    if(Math.random()* 10 + 1 <= 3.5) {
                        imprimirTitulo("Pudiste escapar de " + enemy.name + "!");
                        anythingToContinued();
                        break;
                       
                    } else {
                        imprimirTitulo(" No pudiste escapar");
                        
                        //calculando el daño tomado del jugador
                        
                      int dmgTook = enemy.attack();
                        System.out.println("En tu prisa por tomar 0 " + dmgTook + " Daño!");
                        anythingToContinued();
                        
                        //revisar si el jugador todavia esta vivo
                        if (player.hp <= 0)
                            playerDied();
                          
                    }
             
                }else {
                    imprimirTitulo("TU NO PUEDES ESCAPAR DEL EMPERADOR MALVADO");
                    anythingToContinued();
                    
                }
            }   
        }   
    }

    // imprimir el menu principal
    public static void imprimirMenuPrincipal(){
        limpiarConsola();
        imprimirTitulo(places[place]);
        System.out.println("Escoja una opcion");
        imprimirSeparador(20);
        System.out.println("1) Continua con tu viaje!!!!!");
        System.out.println("2) Informacion de personaje");
        System.out.println("3) Salir del Juego");
        
        
        
    }
    //Batalla final (ultima del juego)
    public static void finalBattle() {
        //crear un emperador malvado y dejar que peleas contra el
        
        battle(new Enemy("THE EVIL EMPEROR", 300));
        
        //imprimiendo el final adecuado
        
        Story.printEnd(player);
        isRunning = false;
        
        
        
    }
    // metodo que llama cuando el jugador muere
    public static void playerDied(){
        limpiarConsola();
        imprimirTitulo("Tu moriste :c ");
        imprimirTitulo("Ganaste " + player.hp + "Xp en tu viaje, Intenta ganar mas la proxima vez");
        imprimirSeparador(15);
        System.out.println("Gracias por jugar!!!!!!!");
        imprimirSeparador(15);
        isRunning = false;
        
        
    }

        // loop del juego principal
    
        public static void gameLoop(){
        while (isRunning){
          imprimirMenuPrincipal();
          int input = readInt("-> ",3);
            switch (input) {
                case 1:
                    continuarViaje();
                    break;
                case 2:
                    informacionPersonaje();
                    break;
                default:
                    isRunning = false;
                    break;
            }
                    
            
          
            
            
        }
        
        
        
    }
}
