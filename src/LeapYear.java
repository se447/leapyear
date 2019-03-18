
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //leap year is divisible by 4
        //for years divisible by 100, they are only leap years if divisible by 400
        //otherwise it isn't a leap year
        
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine()); //read user input
        
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
