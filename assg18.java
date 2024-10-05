
    import java.util.Scanner;
    public class assg18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Handle the case where the number is 0
        if (number == 0) {
            count = 1;
        }

        System.out.println("The number of digits in " + number + " is " + count);
        
        scanner.close();
    }
}


    

