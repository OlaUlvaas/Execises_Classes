package se.lexicon.exercise2;

public class Rectangle {

    private double height;
    private double width;
    private double area;
    private double perimeter;


    public Rectangle(){

    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double getArea(){
        if(height == width){
            getIsSquare();
        }
        return height * width;
    }


    public double getPerimeter(){
        if(height == width){
            getIsSquare();
        }
        return 2 * height + 2 * width;
    }
    public void getIsSquare(){
        System.out.println("The Rectangle is also a Square!");
    }
}
