package com.ipc1.figuras.figuras_geometricas;

public abstract class FiguraGeometrica {
    private double area=0;
    private double perimeter=0;

    abstract public double getArea();

    public void setArea(double area) {
        this.area = area;
    }

    abstract public double getPerimeter();

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public void printArea(){
        System.out.println("El area de la figura es: "+this.getArea());
    }

    public void printPerimeter(){
        System.out.println("El Perimetro de la figura es: "+this.getPerimeter());
    }
}
