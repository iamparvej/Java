import java.io.*;
import java.lang.*;
import java.util.*;

public class Nested_if {
    public static void main(String[] args) {
        //Nasted if in java refers to having one if statement inside another if statement.if outer condition is true the inner condition are checked and executed
        int a = 10;
        int b = 20;

        // outer of condition
        if (a== 10)
        {
            //inner of condition
            if ( b==20)
            {
                System.out.println("GeeksForGeeks");
            }
        }
    }
}
