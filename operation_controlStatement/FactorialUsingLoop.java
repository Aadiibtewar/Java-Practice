package operation_controlStatement;

import java.util.Scanner;

public class FactorialUsingLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        if (!scanner.hasNextInt()){
            System.out.println("Enter the number");
            return;
        }
        int num = scanner.nextInt();

        int fact = 1;
        for (int i = 1;i<=num;i++){
            fact*=i;
           
        }
        System.out.println(fact);
    }
}