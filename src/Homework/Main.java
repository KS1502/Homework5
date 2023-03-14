package Homework;

public class Main {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(5,5);
        System.out.println("Rectangle has area of "+rectangle.getAria(5,5));

        Circle circle = new Circle(3,3,3);
        System.out.println("Circle has area of "+circle.getArea(3,3,3));

        Square square = new Square(7,7);
        System.out.println("Square has area of "+square.getArea(7,7));
    }
}
