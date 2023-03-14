package Mathemathik;

public class Rectangle extends Mathe{
    int a;
    int b;
    public Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }
    int getAria(int a, int b){
        return a+b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    public void rectangle(){
        System.out.println("Rectangle has area of");
    }
}
