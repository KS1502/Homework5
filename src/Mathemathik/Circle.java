package Mathemathik;

public class Circle extends Mathe{
    int r;
    int p;
    int radius;
    public Circle(int r,int p,int radius){
        super();
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
    public void circle(){
        System.out.println("Circle has area of");
    }
}

