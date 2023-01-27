import java.util.Scanner;
public class CalculateValues {

    public static void calculateheat(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your mass.");
        int m = scan.nextInt();

        System.out.println("Please enter your specific heat");
        int c = scan.nextInt();

        System.out.println("Please enter your change in temperature.");
        int t = scan.nextInt();

        int q = m*c*t;

        System.out.println("Your total heat is: ");
        System.out.print(q);

    }

    public static void calculatemass(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your heat.");
        int q = scan.nextInt();

        System.out.println("Please enter your specific heat");
        int c = scan.nextInt();

        System.out.println("Please enter your change in temperature.");
        int t = scan.nextInt();


        int m = q/c*t;

        System.out.println("Your total mass is: ");
        System.out.print(m);

        }
    }


