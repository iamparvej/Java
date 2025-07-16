//IF YOU WANT TO RUN ALL THE PROGRAM PLEASE REMOVE THE COMMENT

import java.util.Scanner;

public class Practice_set06 {
    public static void main(String[] args) {
        //practice problem 1
      /*  float[] marks = {24.5f,56.5f,99.2f,100.4f,63.7f};
        float sum = 0;
        for(float element: marks){
            sum=sum + element;


        }
        System.out.println("The value of sum is " + sum);*/
        //practice problem 2
       /* float[] marks = {24.5f,56.5f,99.2f,100.4f,63.7f};
        float num = 56.5f;
        boolean isInArray = false;
        for(float element: marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){

        System.out.println("The value is present in the array" );
    }
        else{
            System.out.println("The value is not present in the array");
}*/
        //problem 3

        //array containing marks of student in physics
      /*  int [] marks ={80,85,90,65,88,92};
        int total = 0;
        //using each loop to calculate the sum
        for(int mark: marks){
            total +=mark;
        }
        System.out.println("Total marks in physics:  " + total);

       */
        //problem 4
        //Define six pairs of 2*3 matrices
        /*int[][][] matricesA = {
                {{1, 2, 3}, {4, 5, 6}},
                {{2, 3, 4}, {5, 6, 7}},
                {{3, 4, 5}, {6, 7, 8}},
                {{4, 5, 6}, {7, 8, 9}},
                {{5, 6, 7}, {8, 9, 10}},
                {{6, 7, 8}, {9, 10, 11}},

        };
        int[][][] matricesB = {
                {{6, 5, 4}, {3, 2, 1}},
                {{1, 1, 1}, {1, 1, 1}},
                {{2, 2, 2}, {2, 2, 2}},
                {{3, 3, 3}, {3, 3, 3}},
                {{4, 4, 4}, {4, 4, 4}},
                {{5, 5, 5}, {5, 5, 5}}
        };
        //loop through each pair
        for (int k = 0; k < 6; k++) {
            System.out.println("Matrix Addition" + (k + 1) + " :");
            int[][] result = new int[2][3];

            //Addition corresponding elements
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j<3; j++) {
                    result[i][j] = matricesA[k][i][j] + matricesB[k][i][j];
                }
                }
            //print result
            for(int i= 0; i<2; i++){
                for(int j= 0; j< 3; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            }

         */
        //problem 5
       /* Scanner sc = new Scanner(System.in);
        //step 1: input array size
        System.out.println("Enter the Number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        // step2 :input array elements
        System.out.println("Enter" + size + "elements");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        //step3: input the element to find
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();

        //step 4: search for the element
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                found = true ;
                    System.out.println(key + "found at position " + (i + 1));
                    break;
                }
            }
            if (!found) {
                System.out.println(key + "not found in the array.");

            }
            sc.close();

        */
//problem 6
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
       /* System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Step 2: Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Find maximum element
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 4: Output the result
        System.out.println("The maximum element in the array is: " + max);

        sc.close();

        */
        //Problem 7
        //Define an array of an integer
       /* int[] numbers= { 223,14,45,78,9,13,46,677};

        //Assume the frist element is the maximum
        int max = numbers[0];
        //loop throgh the array to find the maximum
        for(int num : numbers){
            if(num> max){
                max= num;

            }
        }
        //print the maximum element
        System.out.println("The maximum element in array is :" + max);

        */


        //problem 7
        //Define the array
        int[] arr={20,5,8,12,20}; //try changing to {2,5,3,8,10} to test unsorted array

        //Assume the array is sorted
        boolean isSorted= true;
        //check adjacent element

        for(int i = 0; i< arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                isSorted=false;
                break;
            }
        }
    //print the result
    if(isSorted)

    {
        System.out.println("The way is sorting in ascending order. ");
    }else {
        System.out.println("The array is NOT sorted");
    }
}
}

