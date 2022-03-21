import java.awt.graphics;
public static void main(String[] args) throws Exception {
public class App { x\
    private int fila=0;
    private int columna=0;
    private final int numerofilas=13;
    private final int numerocolumnas=23;
    private final int anchoBloque=40;
    private final int altoBloque=40;
 

    public void paint(Graphics grafico ){
       int[][]laberinto=obtienelaberinto();

    }
       for(fila=0;fila<numeroFilas;fila++){
           for(columna=0;columna<numeroColumnas;columna++){
           if(laberinto[fila][columna])==1){
               grafico.setColor(color.blue);
               grafico.fillRect(columna*40,fila*40,anchoBloque,altoBloque);
               grafico.serColor(Color.black);
               grafico.drawRect(columna*40,fila*40,anchoBloque,altobloque); 
        

           }
           }
       }


     public int[][] obtieneLaberinto{
     }
     int Laberinto[][] = 
     { { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
       { 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

    }; 
      return laberinto;











     }
    
        













    }
}
