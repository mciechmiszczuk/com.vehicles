package com.vehicles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pinq on 2017-05-06.
 */
public class Data {


    List<Vehicle> allVehicles = new ArrayList<>();//tworzymy liste wszystkich samochodow

    Data(List<Vehicle> acquiredVehicles) {
        allVehicles.addAll(acquiredVehicles);
    }
    //allVehicles.addAll(acquiredLorries);
    //allVehicles.addAll(acquiredBuses);
    //wywolany kontruktor z argumentem carList przekazuje wszystkie rzeczy z listy do listy allVehicles


    public void printAllVehicles() {

        int idx = 0;
        System.out.println("All fleet: ");
        while (idx < allVehicles.size()) {
            if (allVehicles.get(idx) instanceof Car) {
                System.out.println("(passenger car):");
            } else if (allVehicles.get(idx) instanceof Bus) {
                System.out.println("(bus):");
            } else if (allVehicles.get(idx) instanceof Lorry) {
                System.out.println("(lorry):");
            }

            System.out.println("Brand: " + allVehicles.get(idx).getBrand()
                    + " Weight: " + allVehicles.get(idx).getWeight()
                    + " Run: " + allVehicles.get(idx).getRun()
                    + " Driver: " + allVehicles.get(idx).getDriver()
                    + " Registration Number:" + allVehicles.get(idx).getRegNumber());
            idx++;
        }

    }


    public Vehicle searchVehicleByRegNumber(String regNumber) {
        boolean isVehicleFound = false;
        int idx = 0;
        Vehicle vehicle = null;
        while (isVehicleFound == false) {
            vehicle = allVehicles.get(idx);
            isVehicleFound = vehicle.getRegNumber().equals(regNumber);
            idx++;
        }

        return vehicle;
    }

    public void searchVehicleRegNumber(String regNumber) {
        Vehicle vehicle = searchVehicleByRegNumber(regNumber);
        if (vehicle instanceof Car) {
            System.out.println("(passenger car):");
        } else if (vehicle instanceof Bus) {
            System.out.println("(bus):");
        } else if (vehicle instanceof Lorry) {
            System.out.println("(lorry):");
        }

        System.out.println("Brand: " + vehicle.getBrand()
                + " Weight: " + vehicle.getWeight()
                + " Run: " + vehicle.getRun()
                + " Driver: " + vehicle.getDriver()
                + " Registration Number:" + vehicle.getRegNumber());
    }


    public Vehicle searchVehicleByDrivers(String driver) {
        boolean isVehicleFound = false;
        int idx = 0;
        Vehicle vehicle = null;

        while (isVehicleFound == false) {
            vehicle = allVehicles.get(idx);

            isVehicleFound = vehicle.getDriver().equals(driver);

            idx++;
        }

        return vehicle;//zwraca pojazd jako obiekt
    }

    public void searchVehicleDriver(String driver) {
        Vehicle vehicle = searchVehicleByDrivers(driver);
        if (vehicle instanceof Car) {
            System.out.println("(passenger car):");
        } else if (vehicle instanceof Bus) {
            System.out.println("(bus):");
        } else if (vehicle instanceof Lorry) {
            System.out.println("(lorry):");
        }

        System.out.println("Brand: " + vehicle.getBrand()
                + " Weight: " + vehicle.getWeight()
                + " Run: " + vehicle.getRun()
                + " Driver: " + vehicle.getDriver()
                + " Registration Number:" + vehicle.getRegNumber());
    }


    public int onRoute = 0;
    public int atHome = 4;


    public void wentOnRoute(String regNumber, double latitude, double longitude) {
        Vehicle wentOnRoute = searchVehicleByRegNumber(regNumber);
        onRoute++;
        wentOnRoute.setLatitude(latitude);
        wentOnRoute.setLongitude(longitude);
        atHome--;
    }


    public void printNumberOnRoute() {
        System.out.println("On Route: " + onRoute);
    }


    public void printNumberAtHome() {
        if (onRoute > 0) {
            System.out.println("At Home: " + atHome);
        } else {
            System.out.println("All cars at home! In total we have " + allVehicles.size() + " of them.");
        }
    }


    public void findVehicleOnMap(String regNumber) {
        Vehicle vehicle = searchVehicleByRegNumber(regNumber);
        System.out.println("Vehicle " + vehicle.getRegNumber() + " GPS: Latitude: " + vehicle.getLatitude()
                + " Longitude: " + vehicle.getLongitude());

    }


}

