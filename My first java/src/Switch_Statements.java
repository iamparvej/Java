public class Switch_Statements {
    public static void main(String[] args) {
        //Switch Statementsin java is multi-way branch statement
        //in simple words ,the java switch statement executes on one statement from multiple conditions

        int size = 2;
        switch (size) {

                case 1:
                    System.out.println("Extra Samall");
                    break;
                case 2:
                    System.out.println("Small");
                    break;
                case 3:
                    System.out.println("Medium");
                    break;
                case 4:
                    System.out.println("Large");
                    break;
                case 5:
                    System.out.println("Extra large");
                    break;
                default:
                    System.out.println("Invalid size number");

            }
        }
    }
