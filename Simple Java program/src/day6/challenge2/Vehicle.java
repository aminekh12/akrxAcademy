package day6.challenge2;

public class Vehicle {
    private int wheelsNumber;
    private String brand;
    private String maxSpeed;

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(int wheelsNumber, String brand, String maxSpeed) {
        this.wheelsNumber = wheelsNumber;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "{" +
                "wheelsNumber=" + getWheelsNumber() +
                ", brand='" + getBrand() + '\'' +
                ", maxSpeed='" + getMaxSpeed() + '\'' +
                '}';
    }

    public void ride(){
        System.out.println("riding ...");
    }
    public void stop(){
        System.out.println("stop");
    }
}
