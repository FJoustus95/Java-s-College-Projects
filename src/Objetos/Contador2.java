
package Objetos;


public class Contador2 {
    int numero1, numero2, numero3;
    String palabra1, palabra2, palabra3; 
    
    
    Contador2 (int num1, int num2, int num3) {
     this.numero1 = num1;
     this.numero2 = num2;
     this.numero3 = num3;
     
    
        
        
    }
    Contador2 (String word1, String word2, String word3) {
     this.palabra1 = word1;
     this.palabra2 = word2;
     this.palabra3 = word3;
        
    }
    //creando un metodo para imprimir
    
    void incrementar(){
        
        System.out.println("Numeros ingresados para aumentar");
        System.out.println("Numero 1 " + (this.numero1) + "numero 2 " + (this.numero2) + " numero 3 " + (this.numero3));
        System.out.println("Numero incrementados en 1 ");
        System.out.println("Numeros 1 " + (this.numero1+1) + " numero 2 " +(this.numero2 + 1) + " y numero 3 " + (this.numero3+1));
        
        
        
    }
    void decrementar(){
   
        System.out.println("Numeros ingresados para decrementar");
        System.out.println("Numero 1 " + (this.numero1) + "numero 2 " + (this.numero2) + " numero 3 " + (this.numero3));
        System.out.println("Numero incrementados en 1 ");
        System.out.println("Numeros 1 " + (this.numero1-1) + " numero 2 " +(this.numero2 - 1) + " y numero 3 " + (this.numero3-1));
        
        
    }
    public int getnumero1 () {
        return this.numero1;
        
        
    }
    public int getnumero2() {
        return this.numero2;
        
    }
    public int getnumero3() {
        return this.numero3;
        
    }
    void setnumero1(int num1) {
         this.numero1 = num1;
        
    }
    void setnumero2 (int num2) {
        this.numero2 = num2;
    }
    void setnumero3 (int num3) {
        this.numero3 =  num3;
    }
}


