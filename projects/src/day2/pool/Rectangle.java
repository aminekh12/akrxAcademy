package day2.pool;

public class Rectangle {
    private double length,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return this.getLength()*this.getWidth();
    }
    public void displayInfo(){
        System.out.println("length "+this.getLength()+ ", width "+this.getWidth() );
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10,10);
        rect.displayInfo();
        System.out.println("calculated area is : "+ rect.calculateArea());
    }
}
