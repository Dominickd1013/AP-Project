import java.util.Scanner;

public class Interface {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What are you calculating?");
        String question = scan.nextLine();

        System.out.println("What would you like to do?");
        Calculator.Calculate();
    }
}
