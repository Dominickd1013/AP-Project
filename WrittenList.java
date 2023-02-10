import java.util.Scanner;

public class WrittenList {

    public static void List() {

        System.out.println("What would you like to do?");
        System.out.println("1. Write a value down.");
        System.out.println("2. Display my values.");
        String[] valueList = new String[1000];
        int lastValue = 0;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int choice = scan.nextInt();

        if(choice == 1){
            WrittenList.addvaluenote();
        }

        if(choice == 2){
            WrittenList.displayvaluenote();
        }

    }

    public static void addvaluenote() {

        String[] valueList = new String[1000];
        int lastValue = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in the value you want to write down.");
        String keptValue = input.nextLine();
        valueList[lastValue] = keptValue;

    }

    public static void displayvaluenote() {

        String[] valueList = new String[1000];
        int lastValue = 0;
        Scanner input = new Scanner(System.in);
        for (int currentvalue = 0; currentvalue < lastValue; currentvalue++) {
            System.out.println((currentvalue) + "." + (valueList[currentvalue]));
        }

    }

}
