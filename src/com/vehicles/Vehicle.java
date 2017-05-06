package com.vehicles;

/**
 * Created by Pinq on 2017-05-06.
 */
public class Vehicle {
    private String brand;
    private double weight;
    private double run;



    private String driver;
    private String regNumber;



    private double latitude;
    private double longitude;

    public Vehicle(String brand, double weight, double run, String driver, String regNumber, double latitude, double longitude)
    {
        this.brand = brand;
        this.weight = weight;
        this.run = run;
        this.driver = driver;
        this.regNumber = regNumber;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDriver() {
        return driver;
    }


    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public double getRun() {
        return run;
    }


    public String getRegNumber() {
        return regNumber;
    }
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

}

