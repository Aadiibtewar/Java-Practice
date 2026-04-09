package operation_controlStatement;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number...");
        int num = 0;
        if (!scanner.hasNextInt()) {
            System.out.println("Enter valid number");
            return;
        }
        num = scanner.nextInt();
        System.out.println(
                isPrime(num) ? "the number " + num + " is prime" : "the number " + num + " is not prime number");
        scanner.close();
    }

    private static boolean isPrime(int num) {
        if(num<2)return false;
        int den = 2;
        while (num > den) {
            if (num % den == 0) {
                return false;
            }
            den++;
        }

        return true;
    }
}
