package Mathemathik;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 3, 3);
        circle.getArea(3,3,3);
        System.out.println("Circle has area of "+circle.getArea(3,3,3));
        System.out.println();

        Rectangle rectangle = new Rectangle(5, 5);
        rectangle.getAria(5,5);
        System.out.println("Rectangle has area of "+rectangle.getAria(5,5));
        System.out.println();

        Square square = new Square(7, 7);
        square.getArea(7,7);
        System.out.println("Square has area of "+square.getArea(7,7));
        System.out.println();

        List<Mathe> mathe = List.of(circle, rectangle, square);
       // mathe.add(0,circle);
       // mathe.add(1,rectangle);
        //mathe.add(2,square);

        System.out.println(mathe);

        /*Circle has area of 27

Rectangle has area of 10

Square has area of 49

[0 0 0 0 0, 0 0 0 0 0, 0 0 0 0 0] */
        }

    }

