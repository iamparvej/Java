/* Method overloading in java is a feature that  allowas a class to have more than one
method with  the same name ,as long as their parameter lists are different
ke points:
.it compile time polymorphism.
.The method name must be the same
. it help in  increasing code readability and reusability
 */

public class MethodOverloading {
    //method with 1 int parameter
    void display(int a){
        System.out.println("Argument : " + a);
    }

    //overload method with 2 int parameters
    void display(int a, int b){
        System.out.println("Argument: " + a+ " , "+b);

    }
    //overload method with 1 double parameter
    void display(double a ){
        System.out.println("Double Argument: " + a);

    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.display(10);
        obj.display(15, 40);
        obj.display(5.5);
    }
}
