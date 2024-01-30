package day6.challenge2;

public class Bike  extends Vehicle{
    public Bike(int wheelsNumber, String brand, String maxSpeed) {
        super(wheelsNumber, brand, maxSpeed);
    }
    @Override
    public void ride() {
        System.out.println("riding a bike");;
    }

    @Override
    public void stop() {
        System.out.println("stopping a bike");
    }
}
