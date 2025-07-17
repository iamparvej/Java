package Practice_set10;

public class Circle {
    // Base class
    class Circle {
        private double radius;

        // Constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        // Getter
        public double getRadius() {
            return radius;
        }

        // Setter
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Method to calculate area of circle
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Derived class
    class Cylinder extends Circle {
        private double height;

        // Constructor
        public Cylinder(double radius, double height) {
            super(radius); // Call parent constructor
            this.height = height;
        }

        // Getter
        public double getHeight() {
            return height;
        }

        // Setter
        public void setHeight(double height) {
            this.height = height;
        }

        // Method to calculate volume of cylinder
        public double getVolume() {
            return getArea() * height; // Area from Circle class * height
        }
    }

    // Main class to test
    public class Main1 {
        public static void main(String[] args) {
            Cylinder cyl = new Cylinder(15,20);
            System.out.println("Radius: " + cyl.getRadius());
            System.out.println("Height: " + cyl.getHeight());
            System.out.println("Base Area: " + cyl.getArea());
            System.out.println("Volume: " + cyl.getVolume());
        }
    }

}
