/*method in java
method is a block of code that perfroms as specific task .It is used to define the behavior for a calss

 */

public class Calculator {
// method to add two number
    int add(int a, int b){
        return a+b;

    }
    // method to display a message
    void displayMessage(){
        System.out.println("Hello from calculator!");

    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(5,10);
        System.out.println("sum: " + sum);
        calc.displayMessage();
    }
}
