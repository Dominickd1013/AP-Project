import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        System.out.println("What would you like to do?");
        System.out.println("1. Calculator.");
        System.out.println("2. See previously calculated values.");
        Scanner scan = new Scanner(System.in);
        int operation = scan.nextInt();
        scan.nextLine();    //clears the input to allow input for choice

        do {
            System.out.println("What would you like to calculate?");
            String choice = scan.nextLine();

            switch (choice) {
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
                    System.out.println("Please input a valid value, and try again.\n");
                    System.out.println("-----------------------------------------------\n");

            }
        }while (operation == 1);


        do{


            }
        }while (operation == 2);

    }

}
