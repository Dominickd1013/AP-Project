import java.util.Scanner;

public class HeatCalculator {

    private static double m;
    private static double c;
    private static double t;
    private static double q;
    private static double ct;
    private static double mt;
    private static double t1;
    private static double t2;

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
                    System.out.println("All resultant units are based off of what you input." + "\n");
                    CalculateValues.calculateHeat(m, c, t, q);
                    WrittenList.otherList();
                    break;
                case 2:
                    System.out.println("All resultant units are based off of what you input." + "\n");
                    CalculateValues.calculateMass(m, c, t, q, ct);
                    WrittenList.otherList();
                    break;
                case 3:
                    System.out.println("All resultant units are based off of what you input." + "\n");
                    CalculateValues.calculateSpecificHeat(m, c, t, q, mt);
                    WrittenList.otherList();
                    break;
                case 4:
                    System.out.println("All resultant units are based off of what you input." + "\n");
                    CalculateValues.calculateTemperatureChange(m, c, t, q, t1, t2);
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