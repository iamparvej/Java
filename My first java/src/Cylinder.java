public class Cylinder {
    private double radius;
    private double height;

    public  double getRadius(){
        return  radius;
    }
    public void setRadius(double radius){
        if(radius> 0){
            this.radius = radius;
        } else{
            System.out.println("Radius must be a positive value.");
        }
    }
    public double getHeight(){
        return height;
    }
    public void  setHeight(double height){
        if(height> 0){
            this.height = height;
        }else{
            System.out.println("Height must be a positive value");

        }
    }
    public double calculateVolume(){
        return  Math.PI * radius*radius*height;

    }
    //main method to test the calss
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder();
        cyl.setRadius(5.0);
        cyl.setHeight(10.0);
        System.out.println("Radius: " + cyl.getRadius());
        System.out.println("Height: " + cyl.getHeight());
        System.out.println("Volume: " + cyl.calculateVolume());
    }
}
