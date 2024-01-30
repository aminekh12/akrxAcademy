package day6.challenge2;

public class RentalAgencyMain {
    public static void main(String[] args) {
    // cars objects
        Vehicle car= new Car(4,"BMW","320");
        Vehicle car2= new Car(4,"KIA","180");
        Vehicle car3= new Car(4,"AUDI","260");
    // bikes objects
        Vehicle bike= new Bike(2,"BMW","180");
        Vehicle bike3= new Bike(2,"YAMAHA","120");
        Vehicle bike4= new Bike(2,"SUZUKI","160");


        RentalAgency rentalAgency = new RentalAgency();
        // cars
        rentalAgency.addVehicle(car);
        rentalAgency.addVehicle(car2);
        rentalAgency.addVehicle(car3);
        // Bikes
        rentalAgency.addVehicle(bike);
        rentalAgency.addVehicle(bike3);
        rentalAgency.addVehicle(bike4);

        // renting 2 cars and 2 bikes

        rentalAgency.rentVehicle(car);
        rentalAgency.rentVehicle(car2);
        rentalAgency.rentVehicle(bike);
        rentalAgency.rentVehicle(bike4);
        // showing all the availableVehicles
        rentalAgency.showAvailableVehicles();





    }
}
