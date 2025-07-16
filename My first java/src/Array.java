// An array is a collection of similar data types stored in a contiguous memory location
//it allow to store multiple values of the same type using a single variable name
// why use array
// to store multiple values efficiently
//to acces element using indexes
//types of array
//one dimensial array(1D array )
//Two dimensional array(2D array?)
//1.One dimensional array example

//------------------------------------//
public class Array {
    public static void main(String[] args) {
//declaring and initializing an array

        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements using index
        System.out.println(numbers[0]);  // Output: 10
        System.out.println(numbers[2]);  // Output: 30

        // Loop through array
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

