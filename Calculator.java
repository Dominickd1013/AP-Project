import java.util.Scanner;

public class Calculator {

    public static void Calculate() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What are you calculating?");
        String question = scan.nextLine();

        switch (question) {

            case "Q":
                Input.askforheat();
                break;
            case "q":
                Input.askforheat();
                break;
            case "H":
                Input.askforheat();
                break;
            case "h":
                Input.askforheat();
                break;
            case "Heat":
                Input.askforheat();
                break;
            case "heat":
                Input.askforheat();
                break;

            case "M":
                Input.askformass();
                break;
            case "m":
                Input.askformass();
                break;
            case "Mass":
                Input.askformass();
                break;
            case "mass":
                Input.askformass();
                break;

            default: System.out.println("Please input a valid value.");
        }

    }

}


