public class Switch {
    public static void main(String[] args) {
        int day = 5;
        String dayString;
        //switch statement with int data type
        switch (day)
        {
            //case
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            case 4:
                dayString = "Thursday";
                break;
            case 5:
                dayString = "Friday";
                break;
            case 6:
                dayString = "Saturday";
                break;
            case 7:
                dayString = "Sunday";
                break;
                //default case
            default:
                dayString = "Invalid day";

        }
        System.out.println(dayString);
    }
}
