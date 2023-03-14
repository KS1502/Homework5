package Homework;

public class Square extends Main{
    int a;
    int b;

    public Square(int a,int b){
        this.a = a;
        this.b = b;
    }
    int getArea(int a,int b){
        return a*b;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }

}
