import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sumOfPowers = 0;
        int numberOfDigits = 0;

        int tempNumber = originalNumber;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberOfDigits++;
        }

        tempNumber = originalNumber; 
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfPowers += Math.pow(digit, numberOfDigits);
            tempNumber /= 10;
        }

        if (sumOfPowers == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}