package inheritance;

import java.sql.SQLOutput;
/* When one class inherits from another class (using extends), the constructor of the base (super) class is called first, followed by the constructor of the derived (sub) class.
🔸 1. Key Concepts
A subclass does not inherit constructors from its superclass.

The super() keyword is used in the subclass constructor to explicitly call the constructor of the superclass.

If you don’t write super(), Java will automatically call the default constructor of the superclass (if available).


 */
class Animal {
    Animal(String name) {
        System.out.println("Animal name: " + name);
    }
}

class Dog extends Animal {
    Dog(String breed) {
        super("Tommy"); // Calls Animal constructor
        System.out.println("Dog breed: " + breed);
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("Labrador");
    }
}



