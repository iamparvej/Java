public class Square {
    private double side;
    // method to initalize side
    public void setSide(double s){
        side=s;

    }
    // method to calculate area
    public  double getArea(){
        return side*side;
        // METHOD TO CALCULATE PARAMETER

    }
    public  double getPerimeter(){
      return 4 * side;
    }

    // main method to test the class
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(6); // initializing side to 5
        System.out.println("side " + sq.side);
        System.out.println("area " + sq.getArea());
        System.out.println("perimeter " + sq.getPerimeter());
    }
}
