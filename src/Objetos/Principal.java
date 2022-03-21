
package Objetos;


public class Principal {
    
      
    public static void main(String [] args) {
        
      
     // LLamando a la clase Contar
     Contador contar1 = new Contador(10,20, 30);
     
     contar1.incrementar();
     
        System.out.println();
     
      //Llamando a la clase Cuadrado  
     Cuadrado resultado = new Cuadrado(10,10,10,10);
    int perimetro = resultado.calcularPerimetroCuadrado(10, 10, 10, 10);
    
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    
        System.out.println();
        
    int area = resultado.CalcularAreaCuadrado(10, 10);
        System.out.println("El area del cuadrado es :" + area);
    
        System.out.println();
        
      //Llamando a la clase circulo  
    Circulo resultadoCirculo = new Circulo(10);
    double perimetroCirculo = resultadoCirculo.calcularPerimetroCirculo(10);
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);
        
        System.out.println();
          
        
    double areaCirculo = resultadoCirculo.calcularAreaCirculo(10);
        System.out.println("El area del circulo es: " + areaCirculo);
        
        System.out.println();
      
      //Llamando a la clase Rectangulo  
     Rectangulo resultadoRectangulo = new Rectangulo(10, 10);
     int perimetroRectangulo = resultadoRectangulo.calcularPerimetroRectangulo(10, 10);
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
        
        System.out.println();
        
     int areaRectangulo = resultadoRectangulo.CalcularAreaRectangulo(10, 10);
        System.out.println("El area del rectangulo es: " + areaRectangulo);
        
        System.out.println();
        
        //Lamando a la clase Contar2
        Contador contar2 = new Contador(10,20, 30);
     
     contar2.incrementar();
        
     //Lamando a la clase libro
     
     Libro alumno1 = new Libro("Cuento de navidad" , "Luis", "Sanchez" , "resumen");
      
     
     alumno1.setnombre("Mario");
     alumno1.setapellido1("Torres");
     alumno1.setlibro1("El valle del este");
     alumno1.setresumen("leer");
     
     alumno1.mostrarInformacion();
     
        System.out.println();
        
        System.out.println("Operacione de fracciones");
    Fraccion f1 = new Fraccion(1, 4); // Fracción 1/4
        Fraccion f2 = new Fraccion(1, 2); // Fracción 1/2
        Fraccion f3 = new Fraccion(); // Fracción 0/1
        Fraccion f4 = new Fraccion(4); // Fracción 4/1
        // operaciones aritméticas con esas fracciones
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);
        //mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);  
    
    }
    
    
}
