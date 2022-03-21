package com.ipc1.figuras.figuras_geometricas;

public class Triangle extends FiguraGeometrica {

    private int height, base;

    public Triangle(int height, int base) {
        super();
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea(){
        double area = ((double)(height * base))/2;
        super.setArea(area);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = ((double)(height * base));
        super.setArea(perimeter);
        return perimeter;
    }

}
