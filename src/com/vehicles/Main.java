package com.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Vehicle vehicle1 = new Vehicle();

        Car red = new Car("Audi", 1823, 16500, "Zenon", "KRK T987", 99.00, 99.00);
        Bus blue = new Bus("Mercedes", 3200, 256897, "Zdzisiek", "KPR A765", 99.00, 99.00);
        Lorry violet = new Lorry("Man", 3400, 199000, "Rysiek", "WLZ K100", 99.00, 99.00);
        Lorry yellow = new Lorry("Volvo", 3180, 120000, "Franek", "WWW K666", 99.00, 99.00);

        List<Vehicle> vehiclesList = new ArrayList<>();//tworzymy nowa liste carsList, samochodow osobobywch
        vehiclesList.add(red);
        vehiclesList.add(blue);
        vehiclesList.add(violet);
        vehiclesList.add(yellow);


        Data data = new Data(vehiclesList);//wywolujemy konstruktor z data, gdzie za argument podajemy liste carsList


        //System.out.println(red.getBrand());
        //System.out.println(data.allVehicles.toString());
        //System.out.println(data.allVehicles.get(0));
        //System.out.println(data.allVehicles.size());
        //System.out.println(data.allVehicles.get(0).getRegNumber());
        //data.printAllVehicles();
        System.out.println("");
        System.out.println("");
        System.out.println("Search Vehicle by registration number:");
        data.searchVehicleRegNumber("KPR A765");
        System.out.println("");
        System.out.println("");
        System.out.println("How many are vehicles in total:");
        System.out.println(data.allVehicles.size());


        //System.out.println("How many are on route:");
        // data.wentOnRoute("WLZ K100")
        //System.out.println(data.wentOnRoute("WLZ K100"));
        data.printNumberOnRoute();//sprawdzamy ile jest na drodze
        data.printNumberAtHome();
        System.out.println("");
        System.out.println("Time to send one out!");
        data.wentOnRoute("WLZ K100", 77.0, 66.9);//wysylamy jednego w droge
        data.printNumberOnRoute();//sprawdzamy jeszcze raz ile jest na drodze
        data.printNumberAtHome();
        System.out.println("What is the GPS Position of one that we sent on route: ");
        data.findVehicleOnMap("WLZ K100");
        System.out.println("");
        System.out.println("");
        System.out.println("Search vehicle by driver: ");
        data.searchVehicleDriver("Zenon");
        System.out.println("");
        System.out.println("");
        //System.out.println(data.atHome);


        System.out.println("Position of rest of vehicles:");
        data.findVehicleOnMap("KRK T987");
        data.findVehicleOnMap("KPR A765");
        data.findVehicleOnMap("WWW K666");
        System.out.println("");

        System.out.println("Allright, others must go as well!");
        data.wentOnRoute("KRK T987", 55.0, 55.9);//wysylamy jednego w droge
        data.wentOnRoute("KPR A765", 44.0, 22.9);//wysylamy jednego w droge
        data.wentOnRoute("WWW K666", 33.0, 11.9);//wysylamy jednego w droge
        data.findVehicleOnMap("KRK T987");
        data.findVehicleOnMap("KPR A765");
        data.findVehicleOnMap("WWW K666");

        data.printNumberOnRoute();//sprawdzamy jeszcze raz ile jest na drodze
        data.printNumberAtHome();
    }
}

