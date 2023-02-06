import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        System.out.println("What would you like to do?");
        System.out.println("1. Calculator.");
        System.out.println("2. See previously calculated values.");
        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();

        if (action == 1) {

            System.out.println("What would you like to calculate?");
            String question = scan.nextLine();

            switch (question) {
                case "Q":
                case "q":
                case "H":
                case "h":
                case "Heat":
                case "heat":
                    Input.askforheat();
                    break;
                case "M":
                case "m":
                case "Mass":
                case "mass":
                    Input.askformass();
                    break;
                default:
                    System.out.println("Please input a valid value.");

            }

        }

    }

}
