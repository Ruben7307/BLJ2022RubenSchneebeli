package blj.noseryoung.ch;

import java.util.ArrayList;

public class Vehicle extends VehicleRentalManager{
    private String vehicleType;
    private String brand;
    private int maxSpeed;
    private int yearOfBuilding;

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Vehicle(String vehicleType, String brand, int maxSpeed, int yearOfBuilding) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.yearOfBuilding = yearOfBuilding;
    }
}
