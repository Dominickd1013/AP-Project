import java.util.Scanner;

public class CalculateValues {

    private static double m;
    private static double c;
    private static double t;
    private static double q;
    private static double ct;
    private static double mt;
    private static double t1;
    private static double t2;

    public static double calculateHeat(double m, double c, double t, double q) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating heat.\n");

        System.out.println("Please enter your mass.");
        m = scan.nextDouble();
        System.out.println("Please enter your specific heat.");
        c = scan.nextDouble();
        System.out.println("Please enter your change in temperature.");
        t = scan.nextDouble();

        q = m * c * t;

        System.out.println("Your total heat is: " + q + "\n");

        return m;
    }

    public static void calculateMass(double m, double c, double t, double q, double ct) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating mass.\n");

        System.out.println("Please enter your heat.");
        q = scan.nextDouble();
        System.out.println("Please enter your specific heat.");
        c = scan.nextDouble();
        System.out.println("Please enter your change in temperature.");
        t = scan.nextDouble();

        ct = c * t;
        m = q / ct;

        System.out.println("Your total mass is: " + m + "\n");

    }

    public static void calculateSpecificHeat(double m, double c, double t, double q, double mt) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating specific heat.\n");

        System.out.println("Please enter your heat.");
        q = scan.nextDouble();
        System.out.println("Please enter your mass.");
        m = scan.nextDouble();
        System.out.println("Please enter your change in temperature.");
        t = scan.nextDouble();

         mt = m * t;
         c = q / mt;

        System.out.println("Your specific heat is: " + c + "\n");

    }

    public static void calculateTemperatureChange(double m, double c, double t, double q, double t1, double t2) {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating temperature change.\n");

        System.out.println("Please enter your initial temperature.");
        System.out.println("Please enter your final temperature.");
        t2 = scan.nextDouble();

        double changeintemp = t2 - t1;

        System.out.println("Your total temperature change is: " + changeintemp + "\n");

    }

}


