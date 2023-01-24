import java.util.Scanner;
public class CalculateValues {

    public static void calculateheat(){




        System.out.println("Please enter your mass.");
        Scanner scan = new Scanner(System.in);
        //System.out.println("Input a variable");
        int question = scan.nextInt();


        //System.out.println("Please enter your mass.");
        question = scan.nextInt();
        int m = question;

        System.out.println("Please enter your specific heat");
        question = scan.nextInt();
        int c = question;

        System.out.println("Please enter your change in temperature.");
        question = scan.nextInt();
        int t = question;

        int q = m*c*t;

        System.out.print(q);

    }

}
