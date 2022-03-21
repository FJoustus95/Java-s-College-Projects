package com.ipc1.figuras;

import com.ipc1.figuras.figuras_geometricas.FiguraGeometrica;
import com.ipc1.figuras.figuras_geometricas.Square;
import com.ipc1.figuras.figuras_geometricas.Triangle;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        FiguraGeometrica t = new Triangle(5, 2);
        calcularDatosFigura(t);
        FiguraGeometrica s1 = new Square(5);
        calcularDatosFigura(s1);
    }

    public static void calcularDatosFigura(FiguraGeometrica t){
        t.printArea();
        t.printPerimeter();
    }
}