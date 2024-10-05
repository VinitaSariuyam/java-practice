
    import java.util.Scanner;
    public class assg12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("Mathematics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Physics: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][2] = scanner.nextInt();
        }

        System.out.println("\nList of eligible candidates:");
        for (int i = 0; i < n; i++) {
            int math = marks[i][0];
            int physics = marks[i][1];
            int chemistry = marks[i][2];
            int totalAll = math + physics + chemistry;
            int totalMathPhysics = math + physics;

            if ((math >= 60 && physics >= 50 && chemistry >= 40) && (totalAll >= 200 || totalMathPhysics >= 150)) {
                System.out.println("Student " + (i + 1) + " is eligible.");
            } else {
                System.out.println("Student " + (i + 1) + " is not eligible.");
            }
        }
        
        scanner.close();
    }
}

    

