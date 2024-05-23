import java.util.Date;
import java.util.Scanner;

public class schedule {
    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.println("The current date is " + currentDate + "\n" + "Would you like to schedule anything?");

        Scanner dateScanner = new Scanner(System.in);
        Scanner yearScanner = new Scanner(System.in);
        Scanner monthScanner = new Scanner(System.in);
        Scanner dayScanner = new Scanner(System.in);
        Scanner eventScanner = new Scanner(System.in);

        String userInput = dateScanner.nextLine();
        String year = "2024";
        String month = "May";
        String day = "21";
        String eventName = "Event Name";

        if (userInput.equals("y")) {
            System.out.println("What year would you like to schedule?");
            String yearInput = yearScanner.nextLine();
            year = yearInput;
            System.out.println("What month would you like to schedule?");
            String monthInput = monthScanner.nextLine();
            month = monthInput;
            System.out.println("What day would you like to schedule?");
            String dayInput = dayScanner.nextLine();
            day = dayInput;
            System.out.println("What would you like this event to be named?");
            String eventInput = eventScanner.nextLine();
            eventName = eventInput;
            System.out.println("Your event " + eventName + " is now scheduled for " + month + ", " + day + ", " + year);
        }
        if (userInput.equals("n")) {
            try {
                Thread.sleep(2000);
                System.out.println("fuck you");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
