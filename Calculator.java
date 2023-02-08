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
            System.out.println("Please input a number below for selection.\n");
            System.out.println("1. Heat/Q/h.");
            System.out.println("2. Mass/m.");
            System.out.println("3. Specific heat/c.");
            System.out.println("4. Change in temperature.");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Input.askforheat();
                    break;
                case 2:
                    Input.askformass();
                    break;
                case 3:
                    Input.askforspecificheat();
                    break;
                /*case "4":
                    Input.askfortemperature();
                    break;*/
                case 5:
                    System.out.println("Please make a valid decision and try again.\n");
                default:
                    System.out.println("Please input a valid value, and try again.\n");
                    System.out.println("-----------------------------------------------\n");

                    operation = 2;
            }

        }while (operation == 1);


        /*do{


            }
        }while (operation == 2);
*/
    }

}
