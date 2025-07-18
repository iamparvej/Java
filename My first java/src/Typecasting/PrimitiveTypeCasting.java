package Typecasting;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        // Widening - automatic (int to double)

        int num =10;
        double d = num;
        System.out.println(" Widened double value: " + d);
        // Narrowing - manual
        double price = 99.99;
        int roundePrice = (int ) price;
        System.out.println("Narrowed int value:" + roundePrice);

    }
}
