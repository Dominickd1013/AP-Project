import java.util.Scanner;
public class CalculateValuesAndList {

    public static void List() {

        String[] valuelist;
        valuelist = new String[10000];

        String newvalue = calculateheat();
        valuelist[2] = "misc.";

    }

    public static String calculateheat(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your mass.");
        double m = scan.nextDouble();

        System.out.println("Please enter your specific heat");
        double c = scan.nextDouble();

        System.out.println("Please enter your change in temperature.");
        double t = scan.nextDouble();

        double q = m*c*t;

        System.out.println("Your total heat is: ");
        System.out.print(q);
        return "" + q;

    }

    public static void calculatemass(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your heat.");
        double q = scan.nextDouble();

        System.out.println("Please enter your specific heat");
        double c = scan.nextDouble();

        System.out.println("Please enter your change in temperature.");
        double t = scan.nextDouble();


        double ct = c*t;
        double m = q/ct;

        System.out.println("Your total mass is: ");
        System.out.print(m);

        }
    }


