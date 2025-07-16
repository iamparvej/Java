public class Car {
    //Insatance variables
    String brand;
    String color;
    int year;

    //method to display car detials
    void displayDetails(){
        System.out.println("Brand: "+ brand);
        System.out.println("Color: "+ color);
        System.out.println("Year: "+ year);
    }

    public static void main(String[] args) {

        // creaating the first object
        Car car1= new Car();
        car1.brand= "Toyota";
        car1.color ="Red";
        car1.year = 2020;
        car1.displayDetails();
        System.out.println("\n");

        //creating second object
        Car car2 =new Car();
        car2.brand ="Honda";
        car2.color ="Black";
        car2.year = 2022;
        car2.displayDetails();


    }
}
