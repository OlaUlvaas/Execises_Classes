package se.lexicon.exercise2;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args){

        quadrangle();

    }
    public static void quadrangle(){
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();

        System.out.println("\nSet the height of the Rectangle: ");
        double height = scanner.nextDouble();
        while(height <= 0){
            System.out.println("\nHeight must have a positive value, try again: ");
            height = scanner.nextDouble();
        }
        rectangle1.setHeight(height);

        System.out.println("\nSet the width of the Rectangle: ");
        double width = scanner.nextDouble();
        while(width <= 0){
            System.out.println("\nWidth must have a positive value, try again: ");
            width = scanner.nextDouble();
        }
        rectangle1.setWidth(width);


        System.out.println("\n");
        System.out.println("The area of the rectangle is: " + rectangle1.getArea() + " Square meters");
        System.out.println("\n");
        System.out.println("The perimeter of the rectangle is: " + rectangle1.getPerimeter() + " Metres");

    }
}
