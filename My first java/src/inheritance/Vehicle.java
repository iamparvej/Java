package inheritance;

public class Vehicle {
    Vehicle(){
        System.out.println("vehicle constructor called");

    }
}
class Car extends  Vehicle{
    Car(){
        System.out.println("Car constructor called");

    }
}
public  class main  {
    public static void main(String[] args) {
        Car c = new Car();

    }
}