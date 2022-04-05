
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
        gameloop();
        
            
        
            
            
        
        
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
            //batallaFinal();
            
        }
        
        
    }
    
    //Metodo que calcula un enfrentamiento aleatorio
    public static void randomEncounter() {
        
        // numero aleatorio entre 0 a la longitud de enfrentamientos
        
        int encounter = (int) (Math.random()* encounters.length);
        
        // llamando a los respectivos metodos
        if (encounters[encounter].equals("Batalla")){
            
            // batallaAleatoria();
        } else if (encounters[encounter].equals("Descanso")){
            
            //tomarUnDescanso();
            
        } else {
            //tienda();
            
        }
        
    }
    
        //Metodo que continua el viaje 
    public static void continuarViaje(){
        //Verificar si debe aumentar el acto
        checkAct();
        
        //Verificar si no es el ultimo acto
        if(act != 4)
            randomEncounters();
        
        
    }
    //imprimir la informacion mas importante sobre el personaje del jugador
    public static void informacionPersonaje() {
        limpiarConsola();
        imprimirTitulo("Informacion sobre el Personaje");
        System.out.println(player.name + "\tHP: " + player.hp + "/" + player.maxHp);
        imprimirSeparador(20);
        System.out.println("XP: " + player.xp);
        
        
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
    

        // loop del juego principal
    
        public static void gameloop(){
        while (isRunning){
          imprimirMenuPrincipal();
          int input = readInt("-> ",3);
          if (input ==1) 
              continuarViaje();
              
          else if (input == 2)    
              informacionPersonaje();
          else 
              isRunning = false;
          
            
            
        }
        
        
        
    }
}
