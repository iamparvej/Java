/*Recursion - recursion is when a method call itself to solve a problem .It
continuos calling itself with a smaller input it reaches based  case
 */


public class recursion {

        public static int factorial(int n) {
            if (n == 0 || n == 1) { //base case
                return 1;
            } else {
                return n * factorial(n - 1);     // recursive call
            }
        }

        public static void main(String[] args) {
            int result = factorial(5);
            System.out.println("factorial of 5 is :" + result);
        }
    }
