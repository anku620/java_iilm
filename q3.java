import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer to print its multiplication table: ");
        int number = input.nextInt(); 
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
        } else {
            System.out.println("Multiplication Table for " + number + ":");
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

        input.close();
    }
}