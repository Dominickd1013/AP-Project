import java.util.Scanner;

public class WrittenList {

    static Scanner input = new Scanner(System.in);
    public static void List() {
        System.out.println("What would you like to do?");
        System.out.println("1. Write a value down.");
        System.out.println("2. Display my values.");
        String[] valueList = new String[1000];
        int lastValue = 0;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int choice = scan.nextInt();

        if (choice == 1) {
            WrittenList.addvaluenote();
            WrittenList.otherList();
        }

        if (choice == 2) {
            WrittenList.displayvaluenote();
            WrittenList.otherList();
        }
    }

    public static void otherList() {

        System.out.println("What would you like to do now?");
        System.out.println("1. Write a value down.");
        System.out.println("2. Display my values.");
        System.out.println("3. Go back to the calculator.");
        System.out.println("4. Close the program.");
        String[] valueList = new String[1000];
        int lastValue = 0;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {

            case 1:
                WrittenList.addvaluenote();
                WrittenList.otherList();
                break;
            case 2:
                WrittenList.displayvaluenote();
                break;
            case 3:
                System.out.println("You are now back at the calculator");
                HeatCalculator.CalculatorInterface();
                break;
            case 4:
        }
    }

    public static void addvaluenote() {
        System.out.println("Please type in the value you want to write down.");
        int lastValue = 0;
        String[] valueList = new String[1000];
        String keptValue = input.nextLine();
        valueList[lastValue] = keptValue;
        lastValue++;
    }

    public static void displayvaluenote() {
        int lastValue = 0;
        String[] valueList = new String[1000];
        for (int currentvalue = 0; currentvalue < lastValue; currentvalue++) {
            System.out.println((currentvalue) + "." + (valueList[currentvalue]));
        }
    }

}
