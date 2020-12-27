package se.lexicon.exercise1;

public class CarMain {
    public static void main(String[] args){

        Car firstCar = new Car();
        firstCar.setColor("Blue");
        firstCar.setModel("Ford Escort");
        firstCar.setYear(1980);
        firstCar.setMotorSize(220);
        firstCar.drive();
        firstCar.print();

        Car secondCar = new Car(1988, "Fiat Uno", "Red", 110);

        secondCar.drive();
        secondCar.print();

        Car thirdCar = new Car(1996, "Porsche Carrera", "Silver", 480);

        thirdCar.drive();
        thirdCar.print();





    }
}
