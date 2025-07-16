import java.io.*;
public class unary {
    //Unary Operators need only one operand. They are used to increment, decrement, or negate a value.
    public static void main(String[] args) {
        //interger declared
        int a = 10;
        int b = 10;

        //using binary operators
        System.out.println("Postincrement :" + (a++));
        System.out.println("preincrement  : "+ (++a));
        System.out.println("postdecrement  : "+ (b--));
        System.out.println("predecrement  : "+ (--b));

    }
}
