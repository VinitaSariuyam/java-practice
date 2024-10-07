
    import java.util.Scanner;
    public class assg21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Convert Binary to Decimal
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println("Binary " + binaryString + " is equal to Decimal " + decimal);

        // Convert Decimal to Binary
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        String binary = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal " + decimalNumber + " is equal to Binary " + binary);
        
        scanner.close();
    }
}

    

