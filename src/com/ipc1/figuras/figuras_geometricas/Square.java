package com.ipc1.figuras.figuras_geometricas;

public class Square extends FiguraGeometrica {
    private int base;

    public Square(int base) {
        this.base = base;
    }

    @Override
    public double getArea(){
        double area = base*base;
        super.setArea(area);
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 4*base;
        super.setArea(perimeter);
        return perimeter;
    }
}
