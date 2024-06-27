package Inehrtitance;

public class Vehicle {

    int wheelsCount;

    String model;

    Vehicle(){
        System.out.println("creating Vehicle instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount=wheelsCount;
        System.out.println("Creating vehicle with wheels"+wheelsCount);
    }

    void start(){
        System.out.println("Vehicle is start");
    }
}
