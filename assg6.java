
import java.util.scanner;



public class assg6 { 
    public static void main(String[]args){


        scanner scanner = new scanner(system.in);
        System.out.println("enter a year:");

        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

    
}
