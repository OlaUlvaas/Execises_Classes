package se.lexicon.exercise1;

public class Car {

    private static int carId= 0;
    private int year;
    private String model;
    private String color;
    private int motorSize;

    public Car(){
        carId = getCarId();
        carId++;
    }
    public Car(int year, String model, String color, int motorSize){
        carId = getCarId();
        this.year = year;
        this.model = model;
        this.color = color;
        this.motorSize = motorSize;
        carId++;
    }

    public static int getCarId() {
        return carId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(int motorSize) {
        this.motorSize = motorSize;
    }
    // model +”with motor” + motorSize+ ” can drive now.”
    public void drive(){
        System.out.println("-----------------------------------------");
        System.out.println(model + " with motor " + motorSize + " can drive now.");
        System.out.println("-----------------------------------------");
    }

    public void print(){
        System.out.println("*****************************************");
        System.out.println("Car Id: " + carId);
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Motorsize: " + motorSize);
        System.out.println("Car Year: " + year);
        System.out.println("*****************************************");

    }
}
