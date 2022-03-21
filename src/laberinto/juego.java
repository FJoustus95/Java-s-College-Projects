public class App {
    import java.awt.Graphics;
    import java.awt.event.keyListener;
    import java.swing.Jframe;
    import javax.swing.Jpanel;
    
    public class juego extedns Jpanel;{
    public class juego exteds JFrame;
    
    Laberinto laqberinto=new Laberinto();
    Personaje personaje=new Personaje();

    public Juego(){
        addkeyListener(new KeyLitener(){});
        @Override 
        public void keyTyped(KeyEvent e){

        }
        public void keyTyped(KeyEvent e){
         personaje.teclaPresionada(e);    
        }
        public void keyTyped(KeyEvent e){
        X    
        }
    }); x
    setFocusable(true);

    }

    
    public void paint(Graphics grafico){

    laberinto.paint(grafico);
    personaje.paint(grafico);
    }   
    
             
        public static void main(String[] args) throws Exception {
    
    
        JFrame miventana=new JFrame("mi primer laberinto");
     Juego game=new Juego();
     miventana.add(game);
     
      miventana.setSize(920,540);
      miventanta.setLocation(300,200;
      miventana.setVisible(true);
      

      miventana.setDefaultCloseOpeartion(JFrame.EXIT_ON_CLOSE);

      while(true){
          try{
              
        Thread.sleep(10);
          }catch (InterruptedException ex){
              Logger.getLogger(Juego.class.getName())log(Level,Severe,null);
          }
        
        game.repaint();
        
        
      }




        }

    }
}
