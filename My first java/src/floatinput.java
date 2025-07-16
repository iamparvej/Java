import java.util.Scanner;
public class floatinput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:-");
        float a = sc.nextFloat();
        System.out.println("Enter the second number:- ");
        float b = sc .nextFloat();
        float sum = a+b;
        System.out.println("The sum of these number is: ");
        System.out.println(sum );

    }
}
