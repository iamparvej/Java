/* it is possible to inherit attribute and method from one class to another
types of inheritance
1.single Inheritance
2.Multilevel Inheritance
3.Hierarchical Inheritance
# inheritance concept
.subclass(child)
.superclass(parent)

 */


    // Parent class (superclass)
    class Animal {
        void sound() {
            System.out.println("Animals make sound");
        }
    }

    // Child class (subclass)
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    // Main class
    public class Main{
        public static void main(String[] args) {
            Dog d = new Dog();
            d.sound();  // inherited from Animal
            d.bark();   // from Dog
        }
    }




