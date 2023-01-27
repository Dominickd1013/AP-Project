import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What are you calculating?");
        String question = scan.nextLine();

        Filterinput.filterinput();

    }

}


