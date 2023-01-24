//import java.util.*;
import java.util.Scanner;

public class Input {


    public static void askforvariable() {

        Scanner scan = new Scanner(System.in);
        System.out.println("What are you calculating?");
        String question = scan.nextLine(); //this line is for inputs

        if(question.equals("q") || question.equals("heat") || question.equals("Heat")){
            //System.out.println("You're calculating heat? Enter your variable values.");
            CalculateValues.calculateheat();

        }
        /*else{
            System.out.println("Your value is not m.");
            System.out.println("Please enter a different variable");
            question = scan.nextLine();
            System.out.println("Your value is not m.");
        }*/



    }

}
