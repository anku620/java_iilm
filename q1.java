import java.util.Scanner;

public class NumberLengthCalculator {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = inputScanner.nextInt();

        String numberAsString = String.valueOf(number);

        int length = numberAsString.length();

        System.out.println("The length of the number " + number + " is: " + length);

        inputScanner.close();
    }
}