package Interfaces;

public class testInterface{
    final int a = 10;

    void display() {

    }
}
//class implementing interface
class TestClass extends testInterface {
    public boolean a;

    //interface
    public void display(){
        System.out.println("lake");
    }
}
class lake
{
    public static void main(String[] args) {
        {
            TestClass t= new TestClass();
            t.display();
            System.out.println(t.a);
        }
    }
}