import java.util.Scanner;

public class OddNumbersInRange {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        System.out.println("Odd numbers from 1 to " + n + " are:");

        for (int i = 1; i <= n; i++) { 
            if (i % 2 != 0) { 
                System.out.println(i);
            }
        }

        input.close();
    }
}