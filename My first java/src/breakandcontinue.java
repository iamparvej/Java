public class breakandcontinue {
    public static void main(String[] args) {
        //The break and continue statements are the jump statements that are used to skip some statements inside the loop or terminate the loop immediately without checking the test expression.
        for (int i=0; i<10; i++){
            //terminate the loop when i is 5
            if (i== 5)
                break;
            System.out.println("i: " +i);
        }
        System.out.println("out of loop");
    }
}
