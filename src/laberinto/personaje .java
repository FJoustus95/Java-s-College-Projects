
import java.awt.Graphics;
public class App {
   Laberinto lab=new Laberinto();
   private int x=40;
   private int x=40:
   private final int ancho=40; 
   private final int alto=40;
   private final int movimiento=40;
  
    public void paint(Graphics grafico){
        gradico.setcolor(color,red);
        grafico.fillOval(x,y,ancho,alto);
        grafico.setcolor(color,black);
        grafico.drawOval(x,y,ancho,alto);
        

    
    
    }
    public void teclaPresionada(KeyEvent evento){
        int [][]laberinto=lab.obtieneLaberinto();
       if(evento.getKeycode()==37){ //Izquierda 
        if(laberinto[y/40[(x/40)]-1]!=1){

            x=x-movimiento;
        }
    }
       if(evento.getKeycode()==39){ //Derecha
        if(laberinto[y/40[(x/40)]+1]!=1){
        x=x+movimiento;
    }
       if(evento.getKeycode()==40){ //Abajo 
        if(laberinto[y/40[(x/40)]+1]!=1){
        y=y+movimiento;
    }
       if(evento.getKeycode()==38){ //Arriba
        if(laberinto[y/40[(x/40)]-1]!=1){ 
        y=y-movimiento;
        
    }
        
        

        }
    
        

       }
   
   
   
   
   
   
    }









    }
}
