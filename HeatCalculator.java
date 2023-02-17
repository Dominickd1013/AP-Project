import java.util.Scanner;

public class HeatCalculator {

    public static void CalculatorInterface() {


        System.out.println("What would you like to do?");
        System.out.println("1. Calculator.");
        System.out.println("2. Write down your calculated values to keep track.");
        Scanner scan = new Scanner(System.in);
        int operation = scan.nextInt();
        scan.nextLine();    //clears the input to allow input for choice

        if (operation == 1) {
            System.out.println("What would you like to calculate?");
            System.out.println("Please input a number below for selection.\n");
            System.out.println("1. Heat/Q/h.");
            System.out.println("2. Mass/m.");
            System.out.println("3. Specific heat/c.");
            System.out.println("4. Change in temperature.");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Input.askforheat();
                    WrittenList.otherList();
                    break;
                case 2:
                    Input.askformass();
                    WrittenList.otherList();
                    break;
                case 3:
                    Input.askforspecificheat();
                    WrittenList.otherList();
                    break;
                case 4:
                    Input.askfortemperature();
                    WrittenList.otherList();
                    break;
                default:
                    System.out.println("Please make a valid decision and try again.");
                    System.out.println("-----------------------------------------------");
                    operation = 3;
            }
        }
        if (operation == 2) {
            WrittenList.List();
        }
        //setup breakout statement for the calculating loops by making the cases set operation to 3
        if (operation < 0 || operation > 3) {
            System.out.println("Please pick a valid option and try again.");
        }

    }

}