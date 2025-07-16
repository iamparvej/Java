import javax.imageio.stream.ImageInputStream;

public class Practice_set7 {

    //method to print multiplication table of a number
      /*  public static void  printTable(int n){
            System.out.println("multiplication table of " + n+ ":");
            for(int i = 1; i<=10; i++){
                System.out.println(n +" x "+ i + " = "+(n*i));
            }
        }
        //main method to test
        public static void main(String[] args) {
            int number = 5; //you can change this to any number
            printTable(number);

       */
    //problem 3
    //recursive function to calculate sum of first n natural numbers
    /*public static int sum(int n){
        //base case
        if (n==1){
            return 1;
        }
        //recursive case
        return n + sum(n-1);

        }

    public static void main(String[] args) {
        int n = 10; //change the value of n as needed
        System.out.println("sum of first  "+ n+ " Natural number is :" + sum(n));

     */
// problem 4
    //recursive function to return nth fibonacci
   /* static int fib(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fib(n-1)+ fib(n-2);
    }

    public static void main(String[] args) {
        int n = 7; // change n as needed
        System.out.println("The" +n+ "th Fibonacci number is :"+ fib(n));

    */

    //Problem 5
    // function to calculate average

   /* static double findAverage(int...numbers) {
        if (numbers.length == 0) return 0;
        int sum =0;
        for(int num : numbers){
            sum += num;
        }
        return (double) sum/numbers.length;

    }

    public static void main(String[] args) {
        double avg = findAverage(10,20,30,50);
        System.out.println("Average :"+ avg);

    */

   /* static void repeatFour(int n){
        if(n<=0)
            return;
        System.out.print("4 ");
        repeatFour(n-1);
    }

    public static void main(String[] args) {
        int times = 5; // change as needed
        repeatFour(times);

    */
    //problem 6
    // function to convert celsius to fahrenheit
    /*static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25; // change as needed
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius+ "°C =" + fahrenheit + "°F");

     */
   public static void main(String[] args) {
       int times = 5; // change as needed
       for(int i =0; i<times; i++){
           System.out.print("3 ");

   }
    }
}

