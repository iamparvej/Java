public class multi_2D_Array {
    public static void main(String[] args) {
        int[] marks; // A 1-D
        int[][] flats; // A 2-D
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        //Displaying the 2-D Array (for loop)
        System.out.println("printing a 2-D array using for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats.length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println("");
        }
    }
}