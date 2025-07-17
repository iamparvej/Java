package Practice_set10;

// Base class: Rectangle
   public class Rectangle {
        private double length;
        private double width;

        // Constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Getters
        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        // Setters
        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        // Calculate area of rectangle
        public double getArea() {
            return length * width;
        }

        // Calculate perimeter
        public double getPerimeter() {
            return 2 * (length + width);
        }

        public String toString() {
            return "Rectangle [Length = " + length + ", Width = " + width +
                    ", Area = " + getArea() + ", Perimeter = " + getPerimeter() + "]";
        }
    }

// Derived class: Cuboid
    class Cuboid extends Rectangle {
        private double height;

        // Constructor
        public Cuboid(double length, double width, double height) {
            super(length, width);  // calling Rectangle constructor
            this.height = height;
        }

        // Getter and Setter
        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        // Calculate volume
        public double getVolume() {
            return getLength() * getWidth() * height;
        }

        // Calculate surface area
        public double getSurfaceArea() {
            double l = getLength();
            double w = getWidth();
            double h = height;
            return 2 * (l * w + l * h + w * h);
        }

        public String toString() {
            return "Cuboid [Length = " + getLength() + ", Width = " + getWidth() + ", Height = " + height +
                    ", Surface Area = " + getSurfaceArea() + ", Volume = " + getVolume() + "]";
        }
    }

// Main class for testings
    public class Main {
        public static void main(String[] args) {
            // Wall or tile area
            Rectangle wall = new Rectangle(10, 8);
            System.out.println(wall);

            // Room or box
            Cuboid room = new Cuboid(10, 8, 12);
            System.out.println(room);
        }
    }
