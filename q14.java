import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int i = 2; 

        do {
            System.out.println(i);
            i += 2; 
        } while (i <= n);

        sc.close();
    }
}