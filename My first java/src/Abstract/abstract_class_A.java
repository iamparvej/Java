package Abstract;

public class abstract_class_A {
    static B createB() {
        return new B();
    }
    // A Java program to demonstrate
// use of abstract keyword.

    // abstract class
    abstract class A {
        // abstract method
       
        abstract void m1();

        // concrete methods are still
        // allowed in abstract classes
        void m2()
        {
            System.out.println("This is "
                    + "a concrete method.");
        }
    }

    // concrete class B
    static class B extends A {
        private B() {
        }

        // class B must override m1() method
        // otherwise, compile-time
        // exception will be thrown
        void m1()
        {
            System.out.println("B's "
                    + "implementation of m1.");
        }
    }

    // Driver class
    public class AbstractDemo {
        // main function
        public static void main(String args[])
        {
            B b = createB();
            b.m1();
            b.m2();
        }
    }
}