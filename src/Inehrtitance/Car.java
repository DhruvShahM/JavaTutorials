package Inehrtitance;

public class Car extends Vehicle {

    String color;


    static {
        System.out.println("First i'm called");
    }

    void start(){
        Scooter scooterObj=new Scooter();
        scooterObj.breaking(this);
        System.out.println(this);
        System.out.println(this.model+"Car is starting");
        super.start();
    }

    Car breaking(){
        return this;
    }

    public static void main(String[] args) {
        Car obj=new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount=4;
        obj.model="I10";
        obj.color="red";
        obj.start();
        System.out.println(obj.wheelsCount);
    }
}

class  Scooter{

    void breaking(Car car){
        System.out.println(car.model+"is breaking");
    }
}
