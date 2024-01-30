package day6.challenge2;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {

    private List<Vehicle> vehicleList = new ArrayList<>();
    private List<Vehicle> rentedVehicles = new ArrayList<>();


    public void addVehicle(Vehicle vehicle){
        vehicleList.add(vehicle);
    }
    public void rentVehicle(Vehicle vehicle){
        rentedVehicles.add(vehicle);
    }
    public void showAvailableVehicles(){
        for (Vehicle vehicle:vehicleList) {
            if(!(rentedVehicles.contains(vehicle))){
                System.out.println(vehicle);
            }
        }
    }

}
