import java.util.Scanner;

public class CalculateValues {

    public static void calculateHeat() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating heat.\n");

        System.out.println("Please enter your mass.");
        double m = scan.nextDouble();
        System.out.println("Please enter your specific heat.");
        double c = scan.nextDouble();
        System.out.println("Please enter your change in temperature.");
        double t = scan.nextDouble();

        double q = m * c * t;

        System.out.println("Your total heat is: " + q);

    }

    public static void calculateMass() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating mass.\n");

        System.out.println("Please enter your heat.");
        double q = scan.nextDouble();
        System.out.println("Please enter your specific heat.");
        double c = scan.nextDouble();
        System.out.println("Please enter your change in temperature.");
        double t = scan.nextDouble();

        double ct = c * t;
        double m = q / ct;

        System.out.println("Your total mass is: " + m);

    }

    public static void calculateSpecificHeat() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating specific heat.\n");

        System.out.println("Please enter your heat.");
        double q = scan.nextDouble();
        System.out.println("Please enter your mass.");
        double m = scan.nextDouble();
        System.out.println("Please enter your change in temperature.");
        double t = scan.nextDouble();

        double mt = m * t;
        double c = q / mt;

        System.out.println("Your specific heat is: " + c);

    }

    public static void calculateTemperatureChange() {

        Scanner scan = new Scanner(System.in);
        System.out.println("You are now calculating temperature change.\n");

        System.out.println("Please enter your initial temperature.");
        double t1 = scan.nextDouble();
        System.out.println("Please enter your final temperature.");
        double t2 = scan.nextDouble();

        double changeintemp = t2 - t1;

        System.out.println("Your total temperature change is: " + changeintemp);

    }

}


