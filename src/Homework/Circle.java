package Homework;

public class Circle extends Main{
    int r;
    int p;
    int radius;

    public Circle(int r,int p,int radius){
        this.r = r;
        this.p = p;
        this.radius = radius;
    }
    int getArea(int r,int p,int radius){
        return p*r*radius;
    }

    public int getR() {
        return r;
    }

    public int getP() {
        return p;
    }

    public int getRadius() {
        return radius;
    }
}
