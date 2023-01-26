import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What are you calculating?");
        String question = scan.nextLine();

        switch {

            case 1:
        }
        if(question.equals("Q") || question.equals("q") || question.equals("Heat") || question.equals("heat")) {
            Input.askforheat();
        }
        else{
                System.out.println("Input a valid value for your equation.");
        }

        if(question.equals("M") || question.equals("m") || question.equals("Mass") || question.equals("mass")) {
            Input.askformass();
        }
        else{
            System.out.println("Input a valid value for your equation.");
        }

    }

}


