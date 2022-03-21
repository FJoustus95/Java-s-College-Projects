
package SistemaPeliculas;


public class Cliente {
    private String nombre;
    private int iD,  telefono;
     private boolean tienePeliculaPrestada;

    
    private  static int cantidadInstanciaCliente= 0;
    
    public void setiD(int id){
        this.iD = id;
        
    }

    public Cliente(String nombre, int iD, int telefono) {
        
        Cliente.cantidadInstanciaCliente++;
        
        
        this.nombre = nombre;
        this.iD = iD;
        this.telefono = telefono;
        this.tienePeliculaPrestada = true;
         
    }
    
   
    @Override
    public String toString() {
        return "" +
            " =" + getiD() + "'" +
            " nombre: " + getNombre() + "'" +
            " telefono: " + getTelefono() + "'" +
            " disponible: " + isTienePeliculaPrestada() ;
        
        
        
        
    }
    public int getiD(){
        return iD;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isTienePeliculaPrestada() {
        return tienePeliculaPrestada;
    }

    public void setTienePeliculaPrestada(boolean tienePeliculaPrestada) {
        this.tienePeliculaPrestada = tienePeliculaPrestada;
    }

    public static int getCantidadInstanciaCliente() {
        return cantidadInstanciaCliente;
    }

    public static void setCantidadInstanciaCliente(int cantidadInstanciaCliente) {
        Cliente.cantidadInstanciaCliente = cantidadInstanciaCliente;
    }
    
    
}
