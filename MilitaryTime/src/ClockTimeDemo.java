
import java.util.Scanner;

public class ClockTimeDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) 
        {
            try 
            {
                // conversion 
                System.out.println("Convert military time into 12-hour clock time!!!");
                System.out.print("Enter the hours on the military clock: ");
                int hours = scanner.nextInt();
                System.out.print("Enter the minutes on the military clock: ");
                int minutes = scanner.nextInt();
                System.out.print("Enter the seconds on the military clock: ");
                int seconds = scanner.nextInt();

                TimeConverter time1 = new TimeConverter();
                time1.updateTime(hours, minutes, seconds);
                time1.displayTime();

                // Second conversion 
                scanner.nextLine();  
                System.out.print("Enter 24-hour clock time in the format “hours:minutes:seconds”: ");
                String timeString = scanner.nextLine();

                TimeConverter time2 = new TimeConverter();
                time2.updateTime(timeString);
                time2.displayTime();

            } 
            catch (TimeException e) 
            {
                System.out.println(e.getMessage());
            }

            // repeat?
            System.out.print("Would you like to do this again? Enter 'Yes' or 'No': ");
            String response = scanner.nextLine();
            continueProgram = response.equalsIgnoreCase("yes");
        }

        System.out.println("Exiting the program!");
        scanner.close();
    }
}
