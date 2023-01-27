import java.util.Scanner;
public class Filterinput {

    public static void main(String args[]) {

        public static void filterinput () {

            Scanner scan = new Scanner(System.in);
            String question = scan.nextLine();

            switch (question) {

                case "H":
                    Input.askforheat();
                case "h":
                    Input.askforheat();
                case "Heat":
                    Input.askforheat();
                case "heat":
                    Input.askforheat();

                case "M":
                    Input.askformass();
                case "m":
                    Input.askformass();
                case "Mass":
                    Input.askformass();
                case "mass":
                    Input.askformass();

            }
        }

    }
}