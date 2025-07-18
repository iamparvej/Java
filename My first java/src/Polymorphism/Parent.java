package Polymorphism;

import com.sun.security.jgss.GSSUtil;

//class 1 helper class
public class Parent {
    void print (){
        System.out.println("Parent class");

    }
}
// class 2
class subclass1 extends Parent{
    //method
    void print(){
        System.out.println("subclass1");

    }
}

//CLASS 3
class subclass2 extends Parent{
    // method
    void print(){
        System.out.println("subclass 2");
    }
}

//class 4
class  geeks{
    public static void main(String[] args) {
        Parent a;
        a = new subclass1();
        a.print();

        a = new subclass2();
        a.print();
    }

}