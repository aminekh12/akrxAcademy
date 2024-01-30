package day6.challenge2;

public class Car extends Vehicle{
    public Car(int wheelsNumber, String brand, String maxSpeed) {
        super(wheelsNumber, brand, maxSpeed);
    }

    @Override
    public void ride() {
        System.out.println("riding a car");;
    }

    @Override
    public void stop() {
        System.out.println("stopping a car");
    }
}
