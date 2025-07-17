package Practice_set10;

public class Reactangle {
    public class Cuboid extends Rectangle {
        private double height;

        // Constructor
        public Cuboid(double length, double width, double height) {
            super(length, width);  // Call parent constructor
            this.height = height;
        }

        // Getter and Setter
        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        // Method to calculate volume
        public double volume() {
            return getLength() * getWidth() * height;
        }
    }

}
