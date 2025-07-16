public class Arraypractices {
    //sum of all element in an array
    public static void main(String[] args) {
       /* int[] numbers = {10,20,30,40,50};
        int sum = 0;
        for(int num : numbers){
            sum += num ;
        }
        System.out.println("Sum of array elements:" + sum);*/

        /*int [] numbers ={23,45,89,100};
        int max = numbers[0];
        for(int num : numbers){
            if(num > max){
                max= num;
            }
        }
        System.out.println("Largest element: " + max);*/

        //Reverse an array
        /*int[] arr={1,2,3,4,5};
        System.out.print("Reversed array: ");
        for(int i= arr.length -1; i> 0; i--){
            System.out.print(arr[i] +  " ");

        }

         */
        //Search element
        int [] arr={3,5,90,78,24};
        int target= 90;
        boolean found = false;
        for(int num : arr){
            if (num == target) {

                found = true;
                break;
            }
        }
        if(found){
            System.out.println(target + "found in array.");

        }else{
            System.out.println(target + "not found");
        }
    }
}
