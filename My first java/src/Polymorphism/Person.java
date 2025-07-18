package Polymorphism;

public class Person {
    void role(){
        System.out.println("I am a person");
    }
}
//override the rule method
class Father extends  Person{
    //overridden  method to show
    // the father role
    @Override
    void  role(){
        System.out.println("I am Father. ");
    }
}
class Main{
    public static void main(String[] args) {
        Person p = new Father();
        p.role();
    }
}