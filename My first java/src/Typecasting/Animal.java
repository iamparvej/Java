package Typecasting;

public class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class ReferenceTypeCasting {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Dog d = (Dog) a;
        d.bark();
    }
}